package com.company;
import java.util.HashSet;
import java.util.Set;

public class Differ<T>
{
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2)
    {
        HashSet<T> result = new HashSet<T>();
        HashSet<? extends T> hset1 = new HashSet<>(set1);
        HashSet<? extends T> hset2 = new HashSet<>(set2);
        for(T i: set1)
        {
            if(!set2.contains(i))
            {
                result.add(i);
            }
        }
        for(T i: set2)
        {
            if(!set1.contains(i))
            {
                result.add(i);
            }
        }
        return result;
    }
}
