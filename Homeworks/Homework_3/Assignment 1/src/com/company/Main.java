package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        int hash1 = pair.hashCode();
        int hash2 = pair2.hashCode();
        boolean mustBeTrue2 = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(i);
        System.out.println(s);
        System.out.println(mustBeTrue);
        System.out.println(mustBeTrue2);
        System.out.println(pair.toString());
        System.out.println(pair2.toString());
        Pair<Integer, String> pair3 = Pair.of(1, null);
        System.out.println(pair3.toString());
        System.out.println(pair3.hashCode());

    }
}

