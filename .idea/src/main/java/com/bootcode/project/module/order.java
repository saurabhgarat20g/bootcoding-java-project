package com.bootcode.project.module;

import java.util.Date;

public class order {
    int id;
    String DeliveryAddress;
    Date orderDate;
    double amount;
    String Restraunt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRestraunt() {
        return Restraunt;
    }

    public void setRestraunt(String restraunt) {
        Restraunt = restraunt;
    }
}
