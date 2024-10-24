package com.example.lab3POO;

import java.util.Objects;

class Numar {
    private int numar;

    public int getNumar() {
        return numar;
    }

    public Numar(int numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "ReferinteObiecteMain{" +
                "numar=" + numar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//aici verific
        Numar numar1 = (Numar) o;//merge cast ul pentru ca au acelasi tip de clase
        return numar == numar1.numar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numar);
    }
}

public class ReferinteObiecteMain {

    public static void main(String[] args) {
        Numar numar1 = new Numar(1);
        Numar numar2 = new Numar(2);
        Numar numar3 = new Numar(3);
        numar1 = numar2;

        System.out.println(numar1);
        System.out.println(numar2);
        System.out.println(numar3);

    }

}
