package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Originator {
    public Originator(String name) {
        this.name = name;
    }

    //constructor vacío
    public Originator(){

    }

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                '}';
    }
}
