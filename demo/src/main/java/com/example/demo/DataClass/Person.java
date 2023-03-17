package com.example.demo.DataClass;

import java.time.LocalDate;

public class Person {
    private int id;
    private String brand;
    private String category;

    private String date;

    private boolean isChecked;

    public Person() {}

    public Person(boolean isChecked,int id, String brand, String category, String date) {
        this.id = id;
        this.brand = brand;
        this.category = category;
        this.isChecked = isChecked;
        this.date = date;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

