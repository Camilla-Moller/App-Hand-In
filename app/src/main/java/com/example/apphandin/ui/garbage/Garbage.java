package com.example.apphandin.ui.garbage;

public class Garbage {
    private String name;
    private String address;
    private String city;
    private String itemDescription;

    public Garbage(String name, String address, String city, String itemDescription) {
        this.name = name;
        this.address = address;
        this.city =city;
        this.itemDescription = itemDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public  String getCity(){
        return city;
    }

    public void  setCity(String city) {
        this.city=city;
    }

    public Garbage() {}

}
