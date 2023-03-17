package com.example.demo.DataClass;

public class checakedbrand extends brandTable{
    public boolean ischeacked;

    public boolean isIscheacked() {
        return ischeacked;
    }

    public checakedbrand() {
    }

    public checakedbrand(boolean ischeacked) {
        this.ischeacked = ischeacked;
    }

    public checakedbrand(int id, String category, String brand, String date, boolean ischeacked) {
        super(id, category, brand, date);
        this.ischeacked = ischeacked;
    }
    public void setIscheacked(boolean ischeacked) {
        this.ischeacked = ischeacked;
    }
}
