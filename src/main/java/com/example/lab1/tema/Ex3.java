package com.example.lab1.tema;

public class Ex3
{
    /*Construiți un program care identifică toate perechile de numere întregi dintr-un tablou care sunt egale
     cu un alt număr ales de voi (stocat într-o variabilă). */
    public static void main(String[] args)
    {
        int[] numbers = {2, 3, 5, 7, 11, 15, 3};
        int nrAles = 10;

        System.out.println("Perechile de nr care adunate dau " + nrAles + " sunt:");

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] + numbers[j] == nrAles)
                {
                    System.out.println( numbers[i] + ", " + numbers[j] );
                }
            }
        }
    }
}
