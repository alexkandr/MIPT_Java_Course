package com.company.Computers.Desktop;

import com.company.Computers.ComputerImpl;
import com.company.Components.*;

public abstract class Desktop extends ComputerImpl
{
    public Desktop(String maker, String model)
    {
        super(maker, model);
    }

    public Desktop(String maker, String model, Processor _Processor, RAM _RAM, HDD _HDD)
    {
        super(maker, model, _Processor, _RAM, _HDD);
    }
    public Desktop(ComputerImpl c)
    {
        super(c);
    }

}
