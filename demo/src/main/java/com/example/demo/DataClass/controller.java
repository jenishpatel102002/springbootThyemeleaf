package com.example.demo.DataClass;


import com.example.demo.RepoClass.inflowJpaRepo;
import com.example.demo.RepoClass.countJpaRepo;
import com.example.demo.RepoClass.necatJpaRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.print.attribute.standard.Media;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


@Controller
@RequestMapping("/api")
public class controller {

    @Autowired
    private HttpSession httpSession;
    @Autowired
    com.example.demo.RepoClass.chemicalJpaRepo chemicalJpaRepo;

    @Autowired
    com.example.demo.RepoClass.brandJpaRepo brandJpaRepo;

    @Autowired
    necatJpaRepo  newcatJpaRepo;

    @Autowired
    inflowJpaRepo inflowJpaRepo;

    @Autowired
    countJpaRepo countJpaRepo;


    @GetMapping(value = "/hello")
    public  ModelAndView Pu( ModelAndView md){
        Chemical ch=new Chemical();
        md.addObject("saveChemicalname",ch);
        md.setViewName("hello");
//        List<String> chName= chemicalJpaRepo.FindAllByChemicalname();
//        md.addObject("ListChemical",chName);
        return md;

    }

    @PostMapping(value = "/hello")
    public String helo(@ModelAttribute("saveChemicalname") Chemical ch)
    {
        LocalDate dt= LocalDate.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ch.setDate(dt.format(formatters).toString());
        chemicalJpaRepo.save(ch);
        return "redirect:/api/hello";
    }

    @GetMapping(value = "/brand")
    public ModelAndView brandTable(){
        ModelAndView md=new ModelAndView();
        List<String> chName=chemicalJpaRepo.findChemicalname();
        md.addObject("chName",chName);
        brandTable bd=new brandTable();
        md.addObject("brandTable",bd);
        md.setViewName("brand");
        return md;
    }

    @PostMapping(value = "/brand")
    public String brandTable1(@ModelAttribute("brandTable") brandTable bd){
        LocalDate dt= LocalDate.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        bd.setDate(dt.format(formatters).toString());
        System.out.println(bd.getDate().substring(6,10));

        brandJpaRepo.save(bd);
        return "redirect:/api/brand";
    }

    @GetMapping(value = "/newcat")
    public ModelAndView newcat(){
        ModelAndView md=new ModelAndView();
        List<String> chName=chemicalJpaRepo.findChemicalname();
        md.addObject("chName",chName);
        newCategory newCategory=new newCategory();
        md.addObject("newcat",newCategory);
        md.setViewName("newCategory");
        return md;
    }

    @PostMapping(value = "/newcat")
    public String newcat2(@ModelAttribute("newcat") newCategory newcat){
        String todaydate=TodayDate();
        newcat.setDate(todaydate);
        newcatJpaRepo.save(newcat);
        return "redirect:/api/newcat";
    }

    @GetMapping(value = "/inflow")
    public ModelAndView inflow(){
        ModelAndView md=new ModelAndView();
        md.addObject("inflowdata",new inflowTable());
        List<String> chName=chemicalJpaRepo.findChemicalname();
        md.addObject("chName",chName);
        md.setViewName("inflow");
        return md;
    }

    @PostMapping(value = "/loadAvalibledata/{selectcategrory}")
    @ResponseBody
    public Map<String,Object> loaddata(@PathVariable("selectcategrory") String cat){

        Map<String,Object> data=new HashMap<>();
        httpSession.removeAttribute("inflowchemical");
        List<String> chname=newcatJpaRepo.findchemical(cat);
        chname.add(0,"Select String");
        httpSession.setAttribute("inflowchemical",chname);
        data.put("inflowchemical",chname);
        List<String> brandList=brandJpaRepo.brandList(cat);
        data.put("brandList",brandList);
        return data;
    }

    @PostMapping(value = "/loadAvadata/{selectcategrory}/{chname}")
    @ResponseBody
    public Map<String, String> loaddata2(@PathVariable("selectcategrory") String cat, @PathVariable("chname") String chamicalname){
        Map<String,String> chname=new HashMap<>();
        System.out.println(cat);
        System.out.println(chamicalname);
        newCategory newcat= newcatJpaRepo.findData(cat,chamicalname);
        chname.put("casno",newcat.getCasno());
        chname.put("uom",newcat.getUom());
        chname.put("location",newcat.getLocation());
        return chname;
    }

    @PostMapping(value = "/inflow")
    public String pub(@ModelAttribute("inflowdata") inflowTable info){
        System.out.println(info.getCasno());
        info.setFlag("pending");
        info.setFillby((String) httpSession.getAttribute("techname"));

        //info.setInflowid("In"+newInFlowId());
        System.out.println("done");
        inflowJpaRepo.save(info);
        return "redirect:/api/inflow";
    }

    @GetMapping(value = "/inflowdata")
    public ModelAndView testData(){
        ModelAndView md= new ModelAndView("outflowdate");
        md.addObject("bran",brandJpaRepo.findAll());
        return md;
    }

    @PostMapping("/fetch-data")
    @ResponseBody
    public List<brandTable> fetchSelectedData(@RequestParam("ids") List<Integer> ids) {
        List<brandTable> selectedEmployees = brandJpaRepo.findAllById(ids);
        System.out.println(selectedEmployees.get(0).getId());
        return selectedEmployees;
    }

    // remove duplicates from list

//    Set<Customer> depdupeCustomers = new LinkedHashSet<>(customers);
//customers.clear();
//customers.addAll(dedupeCustomers);

//    private String newInFlowId() {
//        int year= LocalDate.now().getYear();
//        if(true)
//        {
//            countJpaRepo.lockTable();
//            count count= countJpaRepo.returnCount(String.valueOf(year),"inflow");
//            if(count!=null){
//                String Cou=String.valueOf(count.getTotal());
//                countJpaRepo.updateCount(String.valueOf(year),"inflow");
//                countJpaRepo.unlockTable();
//                return "-"+String.valueOf(year).substring(2)+"-"+Cou;
//            }
//            else{
//                count c=new count();
//                c.setType("inflow");
//                c.setYear(String.valueOf(year));
//                c.setTotal(1);
//                countJpaRepo.save(c);
//                return "-"+String.valueOf(year).substring(2)+"-1";
//            }
//        }
//        else {
//            System.out.println("locking not possible");
//            return null;
//        }
//    }



    public String TodayDate(){
        LocalDate dt= LocalDate.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return  dt.format(formatters).toString();
    }
}
