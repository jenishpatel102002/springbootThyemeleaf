package com.example.demo.DataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="inflow")
public class inflowTable {
    @Id
    private int id;
    private String category;
    private String namech;
    private String casno;
    private String packSize;
    private String uom;
    private String brand;
    private String prsno;
    private String prsdate;
    private int packno;
    private String mbno;
    private String dateOfExpiry;
    private String location;

    private String remarks;


}
