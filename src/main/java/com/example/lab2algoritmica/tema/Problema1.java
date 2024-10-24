package com.example.lab2algoritmica.tema;

import java.util.Arrays;

public class Problema1 {
    /* Construiți un program care, pentru un tablou de numere întregi,
      va implementa funcționalitatea de a roti la dreapta toate
      elementele cu k poziții.
      De exemplu: T=[1,2,3,4], k=2 => T=[3,4,1,2]
    * */
    public static void main(String[] args) {
        int[] T = {1, 2, 3, 4};
        int k = 2;
        rotesteLaDreapta(T, k);
        System.out.println(Arrays.toString(T));
    }
    public static void rotesteLaDreapta(int[] T, int k) {
        int n = T.length;
        k = k % n;
        int[] rezultat = new int[n];

        // mutam ultimele k elemente la inceput
        for (int i = 0; i < k; i++) {
            rezultat[i] = T[n - k + i];
        }

        // mutam restul elementelor dupa cele k
        for (int i = k; i < n; i++) {
            rezultat[i] = T[i - k];
        }

        // copiem rezultatul inapoi in tabloul original
        for (int i = 0; i < n; i++) {
            T[i] = rezultat[i];
        }
    }
}

/*
* public static int[] schimba(int k,int [] arr)
 {
 int temp=0;
 for(int i=0;i<k;i++)
* {
* for(int j=arr.length-1;j>0;j--)
* {
* temp=arr[j-1];
* arr[j-1]=arr[j];
* arr[j]=temp;
* }
* }
* return arr;
* }*/