package com.company.Computers.Portable;

import com.company.Components.*;
import com.company.Computers.ComputerImpl;

public class Netbook extends Portable
{
    public Netbook(String model, String maker)
    {
        super(model, maker);
    }
    public Netbook(String maker, String model, Processor _Processor, RAM _RAM, HDD _HDD)
    {
        super(maker, model, _Processor, _RAM, _HDD);
    }

    public Netbook(ComputerImpl computer, Display display, Keyboard keyboard)
    {
        super(computer, display, keyboard);
    }

}
