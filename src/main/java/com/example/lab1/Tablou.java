package com.example.lab1;

import java.util.Arrays;

public class Tablou
{
    //un tablou care sa aiba numere 1 si 0; toate nr de 1 la inceput si toate cele de 0 la final

    public static void main(String[] args)
    {
        int[] arr = {0, 1, 0, 1, 0, 1, 1, 0};

        int i=0;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == 1)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));//printeaza array ul

    }
}
