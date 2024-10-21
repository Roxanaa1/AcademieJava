package com.example.lab2algoritmica;

import java.util.Arrays;

public class Problema3 {
    /* Construiți un program care, dintr-un tablou de numere întregi cu
     elemente mai mari decât 0, va șterge din tablou un număr identificat după:
     a. index
     b. valoare(prima)
     */
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 4, 9, 50};
        int index=0;
        int valoare =4;
        System.out.println("Tabloul initial: " + Arrays.toString(arr));

        arr = stergereNumarDupaIndex(arr, index);
        System.out.println("Tabloul dupa stergerea dupa index : " + Arrays.toString(arr));

        arr = stergereNumarDupaValoare(arr, valoare);
        System.out.println("Tabloul dupa stergerea dupa valoare: " + Arrays.toString(arr));
    }

    public static int[] stergereNumarDupaIndex(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
        return arr;
    }

    public static int[] stergereNumarDupaValoare(int[] arr, int valoare) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valoare) {
                index = i;
                break;
            }
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
        return arr;
    }
}
