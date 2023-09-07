package com.bootcode.project.module;

public class menuitem {
    int id;
    String menuname;
    boolean isVeg;
    double price;
    String Flavour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavour() {
        return Flavour;
    }

    public void setFlavour(String flavour) {
        Flavour = flavour;
    }
}
