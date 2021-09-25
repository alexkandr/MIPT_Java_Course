package com.company.Computers.Desktop;

import com.company.Components.*;
import com.company.Computers.ComputerImpl;

public class Nettop extends Desktop
{
    public Nettop(String maker, String model)
    {
        super(maker, model);
    }

    public Nettop(String maker, String model, Processor _Processor, RAM _RAM, HDD _HDD)
    {
        super(maker, model, _Processor, _RAM, _HDD);
    }
    public Nettop(ComputerImpl c)
    {
        super(c);
    }
}
