package com.company.Components;

import com.company.Component;

public class GPU extends Component
{
    public int MemoryCapacity;
    public GPU(String maker, String model)
    {
        super(maker, model);
    }
    public String toString()
    {
        return String.format("%s, Memory: %d GB", super.toString(), MemoryCapacity);
    }
}
