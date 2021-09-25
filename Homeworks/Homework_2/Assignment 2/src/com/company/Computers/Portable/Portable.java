package com.company.Computers.Portable;

import com.company.Components.*;
import com.company.Computers.ComputerImpl;

public abstract class Portable extends ComputerImpl
{
    public Display Display;
    public Keyboard Keyboard;

    public Portable(String maker, String model)
    {
        super(maker, model);
    }

    public Portable(String maker, String model, Processor _Processor, RAM _RAM, HDD _HDD)
    {
        super(maker, model, _Processor, _RAM, _HDD);
    }

    public Portable(ComputerImpl computer, Display display, Keyboard keyboard)
    {
        super(computer);
        this.Display = display;
        this.Keyboard = keyboard;
    }

    public String toString()
    {
        return String.format("%s \n[%s], [%s}", super.toString(), Display.toString(), Keyboard.toString());
    }



}
