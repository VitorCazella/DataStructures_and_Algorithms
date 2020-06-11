package com.company;

public class Customer {
    protected String name = "";
    protected int rate = 0;
    protected String address = "";

    public Customer(String name, int rate, String address){
        this.name = name;
        this.rate = rate;
        this.address = address;
    }

    public String getName() { return this.name; }
    public int getRate(){ return this.rate; }

    public String toString(){
        return ("Name: "+ name + "| Customer rating: "+ rate + "| Address: "+ address);
    }
}
