package com.example.cafeinformation;

public class Cafe {

    private int id;
    private String name;
    private String place;
    private String detail;

    public Cafe(int id, String name, String place, String detail) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getDetail() {
        return detail;
    }
}
