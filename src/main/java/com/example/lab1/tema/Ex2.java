package com.example.lab1.tema;

public class Ex2
{
    public static void main(String[] args)
    {
        int [] arr = {3, 5, 6, 1, 8, 3, 3, 3, 5, 5, 5};
        int [] arr2 = new int[100];
        int maxCount = 0;


        for (int i = 0; i < arr.length; i++)
        {
            arr2[arr[i]]++;
            if (arr2[arr[i]] > maxCount)
            {
                maxCount = arr2[arr[i]];
            }
        }
        System.out.println("Nr care apar de cele mai multe ori sunt:");
        for (int i = 0; i < arr2.length; i++)
        {
            if (arr2[i] == maxCount)
            {
                System.out.println(i + " apare de " + maxCount + " ori.");
            }
        }
    }
}
