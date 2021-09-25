package com.company.Components;

import com.company.Component;

public class Keyboard extends Component
{
    String Language;
    public Keyboard(String maker, String model)
    {
        super(maker, model);
    }
    public String toString()
    {
        return String.format("%s, Language: %s", super.toString(), Language);
    }

}
