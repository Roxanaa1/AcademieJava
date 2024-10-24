package com.example.lab2algoritmica.tema;

import java.util.Arrays;

public class Problema2 {

    /* Inițial, se definește un tablou de numere întregi, mai mari ca 0,
    de 5 elemente. Ulterior, se va construi o metodă prin care se poate adaugă
    un număr primit ca parametru la finalul unui tablou primit, de asemenea,
    ca parametru. Se va returna noul tablou cu numărul adăugat la final, însă
    trebuie să acoperiți și cazul în care nu mai pot exista locuri în tablou.
     */
    public static void main(String[] args) {
        int[] arr = {3, 39, 6, 10, 9};
        System.out.println("Tabloul initial : " + Arrays.toString(arr));
        arr = adaugareNumar(arr, 7);
        System.out.println("Tabloul dupa adaugarea numarului : " + Arrays.toString(arr));

    }
    public static int[] adaugareNumar(int[] arr, int numar) {
        boolean existaLocLiber = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = numar;
                existaLocLiber = true;
                break;
            }
        }

        if (!existaLocLiber) {
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = numar;
        }

        return arr;
    }
    //daca nr diferite de 0 ==lungimea tabloului ,nu mai e loc in tablou
    //primul element 0 pe care il intalnim il inlocuim cu numarul
    //dupa facem un nou tablou copie daca intalnim 0 ca sa adaugam numarul
    //nr=nr de elemente
}
