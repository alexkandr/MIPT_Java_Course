package com.company.Components;

import com.company.Component;

public class Processor extends Component
{
    int Threads;
    int Cores;
    double Speed;
    public Processor(String maker, String model)
    {
        super(maker, model);
    }
    public String toString()
    {
        return String.format("%s, Cores: %d, Threads: %d, Speed: %.1f GH", super.toString(), Cores, Threads, Speed);
    }
}
