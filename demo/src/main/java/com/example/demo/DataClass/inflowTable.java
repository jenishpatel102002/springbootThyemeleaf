package com.example.demo.DataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="inflow")
public class inflowTable {
    @Id
    private int id;
    private String brand;
    private String casno;
    private String category;
    private String dateofexpiry;
    private String namech;

    private String packsize;
    private String uom;

    private String prsno;
    private String prsdate;
    private int packno;
    private String mbno;

    private String location;

    private String remarks;

    private String flag;

    private String fillby;
    private String approveby;

    private String inflowid;

    public inflowTable() {
    }

    public inflowTable(int id, String brand, String casno, String category, String dateofexpiry, String namech, String packsize, String uom, String prsno, String prsdate, int packno, String mbno, String location, String remarks, String flag, String fillby, String approveby, String inflowid) {
        this.id = id;
        this.brand = brand;
        this.casno = casno;
        this.category = category;
        this.dateofexpiry = dateofexpiry;
        this.namech = namech;
        this.packsize = packsize;
        this.uom = uom;
        this.prsno = prsno;
        this.prsdate = prsdate;
        this.packno = packno;
        this.mbno = mbno;
        this.location = location;
        this.remarks = remarks;
        this.flag = flag;
        this.fillby = fillby;
        this.approveby = approveby;
        this.inflowid = inflowid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCasno() {
        return casno;
    }

    public void setCasno(String casno) {
        this.casno = casno;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDateofexpiry() {
        return dateofexpiry;
    }

    public void setDateofexpiry(String dateofexpiry) {
        this.dateofexpiry = dateofexpiry;
    }

    public String getNamech() {
        return namech;
    }

    public void setNamech(String namech) {
        this.namech = namech;
    }

    public String getPacksize() {
        return packsize;
    }

    public void setPacksize(String packsize) {
        this.packsize = packsize;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getPrsno() {
        return prsno;
    }

    public void setPrsno(String prsno) {
        this.prsno = prsno;
    }

    public String getPrsdate() {
        return prsdate;
    }

    public void setPrsdate(String prsdate) {
        this.prsdate = prsdate;
    }

    public int getPackno() {
        return packno;
    }

    public void setPackno(int packno) {
        this.packno = packno;
    }

    public String getMbno() {
        return mbno;
    }

    public void setMbno(String mbno) {
        this.mbno = mbno;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFillby() {
        return fillby;
    }

    public void setFillby(String fillby) {
        this.fillby = fillby;
    }

    public String getApproveby() {
        return approveby;
    }

    public void setApproveby(String approveby) {
        this.approveby = approveby;
    }

    public String getInflowid() {
        return inflowid;
    }

    public void setInflowid(String inflowid) {
        this.inflowid = inflowid;
    }
}
