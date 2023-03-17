package com.example.demo.DataClass;

import java.util.List;

public class listtable {

    public List<checakedbrand> items;

    public listtable(List<checakedbrand> items) {
        this.items = items;
    }

    public listtable() {
    }

    public List<checakedbrand> getItems() {
        return items;
    }

    public void setItems(List<checakedbrand> items) {
        this.items = items;
    }
}
