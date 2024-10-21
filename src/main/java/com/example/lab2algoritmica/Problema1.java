package com.example.lab2algoritmica;

public class Problema1 {
    /* Construiti un program responsabil de a indentifica indexul de echilibru dint un tablou de numere intregi
     * Un index de echilibru este acel index dintr o secventa de numere astefl incat suma numerelor cu
     * indecsii mai mici este egala cu suma numerelor cu indecsii mai mari.*/

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int indexEchilibru = identificareIndex(arr);
        if (indexEchilibru != -1) {
            System.out.println("Indexul de echilibru este: " + indexEchilibru);
        } else {
            System.out.println("Nu exista un index de echilibru în tabloul dat.");
        }
    }

    public static int identificareIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sumaStanga = 0;
            int sumaDreapta = 0;
            //suma stanga
            for (int j = 0; j < i; j++) {
                sumaStanga = sumaStanga + arr[j];
            }
            //suma dreapta
            for (int k = i + 1; k < arr.length; k++) {
                sumaDreapta = sumaDreapta + arr[k];
            }
            //verificam daca cele 2 sume is egale
            if (sumaStanga == sumaDreapta) {
                return i;//ret indexul
            }
        }
        return -1;
    }
}

