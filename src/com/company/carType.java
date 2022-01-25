package com.company;

public class carType extends model{
    public carType(String name, int price, String year) {
        super(name, price, year);
    }
    carType ford = new carType("escort",1500,1999);



    public carType(String escort, int price, int i) {
        super("car",1500, String.valueOf(1999));
        System.out.println(ford);
    }

}
