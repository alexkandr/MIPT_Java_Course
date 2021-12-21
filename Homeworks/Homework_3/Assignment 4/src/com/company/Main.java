package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        MyArrayList list1 = new MyArrayList();
        Scanner sc = new Scanner(System.in);
        String data[] = sc.nextLine().split(" ");

        for (int i = 0; i < data.length; i++)
        {
            list1.add(Integer.parseInt(data[i]));
        }

        System.out.println(list1.size());
        System.out.println(list1.get(1));
        System.out.println(list1.remove(2));
        System.out.println(list1.size());

        for (int i = 0; i < list1.size(); i++)
        {
            System.out.print(list1.get(i) + " ");
        }
    }
}