package com.company.Computers.Portable;

import com.company.Components.*;
import com.company.Computers.ComputerImpl;

public class Laptop extends Portable
{
    public Laptop(String model, String maker)
    {
        super(model, maker);
    }
    public Laptop(String maker, String model, Processor _Processor, RAM _RAM, HDD _HDD)
    {
        super(maker, model, _Processor, _RAM, _HDD);
    }

    public Laptop(ComputerImpl computer, Display display, Keyboard keyboard)
    {
        super(computer, display, keyboard);
    }

}
