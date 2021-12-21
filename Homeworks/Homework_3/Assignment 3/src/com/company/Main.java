package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Set<Object> set1 = new HashSet<>();
        Set<Object> set2 = new HashSet<>();
//        System.out.println("Введите элементы первого множества:");
//        Scanner sc = new Scanner(System.in);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(0);
        set2.add("1");
        set2.add(3);
        set2.add(0);
        set2.add("4");
        System.out.println(Differ.symmetricDifference(set1, set2));
    }
}
