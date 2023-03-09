package com.example.demo.DataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Chemical {
    @Id
    private int id;
    private String chemicalname;
    private String date;

    public Chemical() {
    }

    public Chemical(int id, String chemicalname, String date) {
        this.id = id;
        this.chemicalname = chemicalname;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChemicalname() {
        return chemicalname;
    }

    public void setChemicalname(String chemicalname) {
        this.chemicalname = chemicalname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
