package com.company.Computers.Desktop;

import com.company.Components.*;
import com.company.Computers.ComputerImpl;

public class PC extends Desktop
{
    GPU GPU;
    public PC(String maker, String model)
    {
        super(maker, model);
    }

    public PC(String maker, String model, Processor _Processor, RAM _RAM, HDD _HDD)
    {
        super(maker, model, _Processor, _RAM, _HDD);
    }
    public PC(ComputerImpl c, GPU _GPU)
    {
        super(c);
        GPU = _GPU;
    }

    public String toString()
    {
        return String.format("%s, [%s]", super.toString(), GPU.toString());
    }

}
