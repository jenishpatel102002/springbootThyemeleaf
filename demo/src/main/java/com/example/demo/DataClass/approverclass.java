package com.example.demo.DataClass;

import jakarta.persistence.*;

@Entity
@Table(name = "outflowapprove")
public class approverclass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String flag;

    private  String approver;

    private String outflowid;

    private String techname;

    private int count;

    public approverclass() {
    }

    public approverclass( String flag, String approver, String outflowid, String techname,int count) {
        this.flag = flag;
        this.approver = approver;
        this.outflowid = outflowid;
        this.techname = techname;
        this.count=count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getOutflowid() {
        return outflowid;
    }

    public void setOutflowid(String outflowid) {
        this.outflowid = outflowid;
    }

    public String getTechname() {
        return techname;
    }

    public void setTechname(String techname) {
        this.techname = techname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
