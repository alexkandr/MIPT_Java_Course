package com.company.Computers;

import com.company.Components.*;

public class Server extends ComputerImpl
{
    public Server(String maker, String model)
    {
        super(maker, model);
    }

    public Server(String maker, String model, Processor _Processor, RAM _RAM, HDD _HDD)
    {
        super(maker, model, _Processor, _RAM, _HDD);
    }
    public Server(ComputerImpl c)
    {
        super(c);
    }


}
