package com.company.Components;

import com.company.Component;

public class RAM extends Component
{
    int Capacity;
    double Speed;

    public RAM(String maker, String model)
    {
        super(maker, model);
    }
    public String toString()
    {
        return String.format("%s, Capacity: %d, Speed: %.1f GH", super.toString(), Capacity, Speed);
    }
}
