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

    public inflowTable() {
    }

    public inflowTable(int id, String category, String namech, String casno, String packSize, String uom, String brand, String prsno, String prsdate, int packno, String mbno, String dateofexpiry, String location, String remarks, String flag) {
        this.id = id;
        this.category = category;
        this.namech = namech;
        this.casno = casno;
        this.packSize = packSize;
        this.uom = uom;
        this.brand = brand;
        this.prsno = prsno;
        this.prsdate = prsdate;
        this.packno = packno;
        this.mbno = mbno;
        this.dateofexpiry = dateofexpiry;
        this.location = location;
        this.remarks = remarks;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNamech() {
        return namech;
    }

    public void setNamech(String namech) {
        this.namech = namech;
    }

    public String getCasno() {
        return casno;
    }

    public void setCasno(String casno) {
        this.casno = casno;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getDateofexpiry() {
        return dateofexpiry;
    }

    public void setDateofexpiry(String dateofexpiry) {
        this.dateofexpiry = dateofexpiry;
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
}
