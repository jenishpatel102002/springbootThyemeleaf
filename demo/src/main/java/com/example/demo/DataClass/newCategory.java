package com.example.demo.DataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "newcat")
public class newCategory {
    @Id
    private int id;
    private String category;
    private String chemicalname;
    private String uom;
    private String casno;
    private String location ;
    private int minimumstock;
    private String date;

    public newCategory() {
    }

    public newCategory(int id, String category, String chemicalname, String uom, String casno, String location, int minimumstock ,String date) {
        this.id = id;
        this.category = category;
        this.chemicalname = chemicalname;
        this.uom = uom;
        this.casno = casno;
        this.location = location;
        this.minimumstock = minimumstock;
        this.date=date;
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

    public String getChemicalname() {
        return chemicalname;
    }

    public void setChemicalname(String chemicalname) {
        this.chemicalname = chemicalname;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getCasno() {
        return casno;
    }

    public void setCasno(String casno) {
        this.casno = casno;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMinimumstock() {
        return minimumstock;
    }

    public void setMinimumstock(int minimumstock) {
        this.minimumstock = minimumstock;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
