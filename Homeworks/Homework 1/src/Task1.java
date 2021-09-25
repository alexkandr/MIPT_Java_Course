public class Task1
{
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    public static int fact(int n)
    {
        if (n < 2) return 1;
        return n * fact(n - 1);
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table()
    {
        for (int i = 1; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n)
    {
        if (n < 0) return sum((-1) * n);
        if (n % 10 == n) return n;
        return sum((n - n % 10) / 10) + n % 10;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year)
    {
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    return true;
                }
                return false;
            }
            return true;

        }
        return false;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static int daysInYear(int year)
    {
        if (isLeapYear(year)){
            return 366;
        } else {
            return 365;
        }
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String n)
    {
        int x = 0;
        switch(n)
        {
            case "Понедельник": x = 1; break;
            case "Вторник": x = 2; break;
            case "Среда": x = 3; break;
            case "Четверг": x = 4; break;
            case "Пятница": x = 5; break;
            case "Суббота": x = 6; break;
            case " Воскресенье": x = 7; break;
        }
        return x;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array)
    {
        System.out.print("[" + array[0]);
        for (int i = 1; i < array.length; i++)
        {
            System.out.print(", " + array[i]);
        }
        System.out.println("]");
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array)
    {
        for (int[] row:array)
            printArray(row);
    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++)
            for(int j = i; j < array.length; j++)
            {
                if (array[j] < array[i])
                {
                    array[j] += array[i];
                    array[i] = array[j] - array[i];
                    array[j] -= array[i];
                }
            }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}