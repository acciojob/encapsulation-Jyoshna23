package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "jyoshna";
//        System.out.println(obj.name + "Error: you might seen some error, please not it down in commnets");

        obj.setName("jyoshna");
        obj.getName();
    }
}