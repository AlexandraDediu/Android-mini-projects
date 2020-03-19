package com.example.week4;

public class Person {

    private final String name;
    private final String surName;
    private final String number;

    public Person( String name, String surName, String number){
        this.name=name;
        this.surName=surName;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getNumber() {
        return number;
    }
}
