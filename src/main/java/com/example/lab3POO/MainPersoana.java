package com.example.lab3POO;

import java.util.Objects;

class Persoana {
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana() {
    }

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return varsta == persoana.varsta && Objects.equals(nume, persoana.nume) && Objects.equals(prenume, persoana.prenume);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}

public class MainPersoana {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana();
        Persoana persoana2 = new Persoana("Enache", "Roxana", 21);
        persoana1 = persoana2;
        System.out.println(persoana1);//afiseaza enache roxana....
        // pt ca persoana1 o sa pointeze catre aceeasi adresa de memorie ca persoana2

        System.out.println(persoana1==persoana2);//true
        System.out.println(persoana1.equals(persoana2));//true

    }
}
