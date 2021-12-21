package com.company;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Должен наследовать SimpleList
 *
 * Должен иметь 2 конструктора
 * - без аргументов - создает внутренний массив дефолтного размера
 на ваш выбор
 * - с аргументом - начальный размер массива
 */
public class MyArrayList implements SimpleList
{
    public int array[];
    public int current_size = 0;
    public int size = 10;
    public MyArrayList()
    {
        // ваш 1й конструктор
        this.array = new int[size];
    }
    public MyArrayList(int capacity)
    {
        // ваш 2й конструктор
        this.size = capacity;
        this.array = new int[size];
    }
    @Override
    public void add(int item)
    {
        // ваш метод
        if (current_size == size)
        {
            size = (int) (size * 1.5);
            int[] temp = array;
            array = new int[size];
            for (int i = 0; i < temp.length; i++)
            {
                array[i] = temp[i];
            }
        }
        array[current_size] = item;
        current_size += 1;
    }
    @Override
    public int remove(int idx) throws NoSuchElementException
    {
        // ваш метод
        if (idx >= 0 && idx < current_size)
        {
            int removed = array[idx];
            for (int i = idx; i < current_size; i++)
            {
                array[i] = array[i + 1];
            }
            int[] temp = array;
            array = new int[size - 1];
            current_size -= 1;
            for (int i = 0; i < current_size; i++)
            {
                array[i] = temp[i];
            }
            return removed;
        }
        else
        {
            throw new NoSuchElementException();
        }
    }
    @Override
    public int size()
    {
        // ваш метод
        return current_size;
    }
    @Override
    public int get(int idx) throws NoSuchElementException
    {
        // ваш метод
        if (idx >= 0 && idx < current_size) return array[idx];
        else throw new NoSuchElementException();
    }
}
