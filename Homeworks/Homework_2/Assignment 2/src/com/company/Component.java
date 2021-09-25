package com.company;

import java.io.Serializable;

public abstract class Component implements Serializable
{
    String Maker;
    String Model;
    public Component(String maker, String model)
    {
        this.Maker = maker;
        this.Model = model;
    }
    public String toString(){
        return String.format("Category: %s, Brand: %s, Model: %s", getClass().getSimpleName(), Maker, Model);
    }
}
