package com.example.lab2algoritmica;

public class Problema2 {
    /* Construiți un program ce identifică toți "liderii" dintr-un tablou de numere întregi.
    Un element din tablou este "lider" dacă este mai mare decât toate elementele din dreapta sa. */
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 10, 7, 3};
        int[] lideri = indetificareLideri(arr);
        for (int lider : lideri) {
            if (lider != 0) {
                System.out.println(lider);
            }
        }
    }

    public static int[] indetificareLideri(int[] arr) {
        int[] lideri = new int[arr.length];
        int indexLideri = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean esteLider = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    esteLider = false;
                    break;
                }
            }
            if (esteLider) {
                lideri[indexLideri++] = arr[i];
            }
        }
        return lideri;
    }

    /*alta varianta */



}
