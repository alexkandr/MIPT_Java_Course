package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static final int size = 20;
    public static void main(String[] args)  throws Exception
    {
        ArrayList<Integer> input = readList();
        ArrayList<Integer> dividedByTwo = new ArrayList<>();
        ArrayList<Integer> dividedByThree = new ArrayList<>();
        ArrayList<Integer> rest = new ArrayList<>();


1
        for (int i = 0; i < input.size(); i++)
        {
            Integer elem = input.get(i);
            if (elem % 3 == 0) dividedByThree.add(elem);
            if (elem % 2 == 0) dividedByTwo.add(elem);
            if (elem % 2 != 0 && elem % 3 != 0) rest.add(elem);
        }

        System.out.print("Elements divided by two: ");
        printList(dividedByTwo);

        System.out.print("Elements divided by three: ");
        printList(dividedByThree);

        System.out.print("Elements divided neither by two or three: ");
        printList(rest);
    }

    public static ArrayList<Integer> readList() throws Exception
    {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input= new ArrayList<>();
        String data[] = (sc.nextLine().split(" "));

        for (int i = 0; i < data.length; i++)
        {
            try
            {
                input.add(Integer.parseInt(data[i]));
            }
            catch (NumberFormatException error)
            {
                throw new ArrayException("An incorrect type of variable was passed");
            }
        }

        if (input.size() != size)
        {
            throw new ArrayException("An incorrect amount of variables was passed");
        }

        return input;
    }

    public static void printList(ArrayList<Integer> list)
    {
        //напишите тут ваш код
        for (Integer i : list)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
