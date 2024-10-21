package com.example.lab1.tema;

import java.util.Arrays;

public class Ex1
{
    /*Construiți un program care, pe baza unui tablou de numere întregi, va stoca într-un alt tablou toate
     numerele divizibile cu 3.*/
    public static void main(String[] args)
    {
        int [] arr={ 2,3,4,7,6,9,13,12};
        int [] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%3==0)
            {
                arr2[i]=arr[i];
            }
        }
        System.out.println("Toate numerele divizile cu 3 :");
        for(int n:arr2)
        {
            if(n>0)
            {
                System.out.println(n);
            }
        }

    }
}
