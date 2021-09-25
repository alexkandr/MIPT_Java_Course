package com.company.Components;

import com.company.Component;

public class Display extends Component
{
    public double Diagonal;

    public Display(String maker, String model)
    {
        super(maker, model);
    }
    public String toString()
    {
        return String.format("%s, Diagonal: %.1f\"", super.toString(), Diagonal);
    }

}
