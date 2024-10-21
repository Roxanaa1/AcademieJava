package com.example.lab1algoritmica;

public class Palindrom
{
    public static void main(String[] args)
    {
        int numar=131;
        int numarInvers=0;
        int copieNumar=numar;

        while(numar>0)
        {
            int n=numar%10; //ULTIMA CIFRA
            numarInvers=numarInvers*10+n;
            numar=numar/10;
        }

        if(copieNumar==numarInvers)
        {
            System.out.println("Numarul este palindrom ");
        }
        else {
            System.out.println("Numarul nu este palindrom ");
        }
    }
}
