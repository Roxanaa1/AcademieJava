package com.example.lab1;

public class Tablou2
{
    public static void main(String[] args)
    {
        //avem un tablou si tre sa afisam acele elemente care apare de cel putin jumatate +1 ca nr de elemete

        int[] numbers = {3, 3, 3, 4, 3, 3,4,4,4,4,4};
        int n=numbers.length;
        int m=(n/2)+1;

        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(numbers[j]==numbers[i])
                {
                    count++;
                }
            }
            if(count>=m)
            {
                System.out.println(numbers[i]+" apare de "+ m +" ori");
                break;//opresc sa nu mai apara dublicate
            }

        }
    }
}
//care are un tablou sa indentifice care e cel mai mic numar si al doilea cel mai mic nuamr