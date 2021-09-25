package com.company.Computers;

import com.company.Component;
import com.company.Components.Processor;
import com.company.Components.RAM;
import com.company.Components.HDD;

import java.io.Serializable;
import java.util.ArrayList;


public abstract class ComputerImpl implements Computer, Serializable
{
    String Maker;
    String Model;
    Processor Processor;
    RAM RAM;
    HDD HDD;

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString

    public ComputerImpl(String maker, String model)
    {
        this.Maker = maker;
        this.Model = model;
    }

    public ComputerImpl(String maker, String model, Processor _Processor, RAM _RAM, HDD _HDD)
    {
        this.Maker = maker;
        this.Model = model;
        this.HDD = _HDD;
        this.Processor = _Processor;
        this.RAM = _RAM;
    }

    public ComputerImpl(ComputerImpl c)
    {
        this.Maker = c.Maker;
        this.Model = c.Model;
        this.HDD = c.HDD;
        this.Processor = c.Processor;
        this.RAM = c.RAM;
    }

    public String toString()
    {
        return String.format("Maker: %s, Model: %s, [%s], [%s], [%s]", Maker, Model, Processor.toString(), RAM.toString(), HDD.toString());
    }

    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+"\n\t" + toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+"\n\t" + toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+"\n\t"+ toString();
    }

}
