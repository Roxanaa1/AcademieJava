package com.example.lab1;

public class Tablou3
{

    //care are un tablou sa indentifice care e cel mai mic numar si al doilea cel mai mic nuamr
    public static void main(String[] args)
    {
        int [] vector = {1, 3, 4, 2, 87, 43};
        int cmmn = Integer.MAX_VALUE; // cel mai mic numar;
        int dcmmn = Integer.MAX_VALUE; // al doilea cel mai mic numar;

        for (int i = 0; i < vector.length; i++)
        {
            if (vector[i] < cmmn)
            {
                dcmmn = cmmn;
                cmmn = vector[i];
            }
            else if (vector[i] < dcmmn)
            {
                dcmmn = vector[i];
            }
        }

        System.out.println("Cel mai mic numar este: " + cmmn);
        System.out.println("Al doilea cel mai mic numar este: " + dcmmn);
    }
}
