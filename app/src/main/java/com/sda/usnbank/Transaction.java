package com.sda.usnbank;

public class Transaction {
    String serviceType = "";
    double amount;

    public Transaction(String service, double amount ){
        this.serviceType = service;

        this.amount = amount;
    }
    public String getServiceType(){
        return serviceType;
    }
    public double getAmount(){
        return amount;
    }
}
