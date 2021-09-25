package com.company.Components;

import com.company.Component;

public class HDD extends Component
{
    public String Type;
    public int Capacity;

    public HDD(String maker, String model)
    {
        super(maker, model);
    }
    public String toString()
    {
        return String.format("%s, Capacity: %d GB, Type: %s", super.toString(), Capacity, Type);
    }
}
