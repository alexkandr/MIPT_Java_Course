package com.company.Computers.Desktop;

import com.company.Components.*;
import com.company.Computers.ComputerImpl;

public class Monoblock extends Desktop
{
    Display Display;

    public Monoblock(String maker, String model)
    {
        super(maker, model);
    }

    public Monoblock(String maker, String model, Processor _Processor, RAM _RAM, HDD _HDD)
    {
        super(maker, model, _Processor, _RAM, _HDD);
    }
    public Monoblock(ComputerImpl c, Display display)
    {
        super(c);
        Display = display;
    }

    public String toString()
    {
        return String.format("%s, [%s]", super.toString(), Display.toString());
    }


}
