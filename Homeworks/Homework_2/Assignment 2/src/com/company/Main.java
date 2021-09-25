package com.company;

import com.company.Computers.ComputerImpl;
import com.company.Computers.*;
import com.company.Components.*;
import com.company.Computers.Desktop.*;
import com.company.Computers.Portable.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static ArrayList<ComputerImpl> Computers = new ArrayList<>();

    private static void Deserialize(String FileName)
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FileName)))
        {

            Computers=((ArrayList<ComputerImpl>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
    private static void Serialize(String FileName)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileName)))
        {
            oos.writeObject(Computers);
            System.out.println("File has been written");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

    }

    private static void Init()
    {
        Processor p = new Processor("Intel", "i9 10000k");
        RAM ram = new RAM("HyperX", "HX430");
        HDD hdd = new HDD("Samsung", "abc");
        Display d = new Display("Samsung", "C24RG50");
        d.Diagonal = 22.5;
        Keyboard k = new Keyboard("HyperX", "Alloy Origins black");
        GPU gpu = new GPU("NVidia", "1660Ti");

        Nettop c1 = new Nettop("Intel","Unknown", p, ram, hdd);
        Nettop c2 = new Nettop("Acer", "Veriton", p, ram, hdd);
        Monoblock c3 = new Monoblock(c1, d);
        PC c4 = new PC(c2, gpu);
        Netbook c5 = new Netbook(c1, d, k);
        Laptop c6 = new Laptop(c2, d, k);
        Server c7 = new Server(c1);

        Computers.add(c1);
        Computers.add(c2);
        Computers.add(c3);
        Computers.add(c4);
        Computers.add(c5);
        Computers.add(c6);
        Computers.add(c7);
    }

    private static void Clear()
    {
        Computers = new ArrayList<>();
    }

    public static void main(String[] args)
    {
        //Deserialize("Computers.dat");
        Init();
        for (ComputerImpl x : Computers)
        {
            System.out.println(x.turnOn() + "\n");
            System.out.println(x.connect() + "\n");
            System.out.println(x.turnOff() + "\n\n\n");
        }
        //Serialize("Computers.dat");
    }
}
