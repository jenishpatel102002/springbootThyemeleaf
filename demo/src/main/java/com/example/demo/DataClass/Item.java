package com.example.demo.DataClass;

import java.util.List;

public class Item {
    private List<checakedbrand> persons;

    public Item() {}

    public Item(List<checakedbrand> persons) {
        this.persons = persons;
    }

    public List<checakedbrand> getPersons() {
        return persons;
    }

    public void setPersons(List<checakedbrand> persons) {
        this.persons = persons;
    }
}
