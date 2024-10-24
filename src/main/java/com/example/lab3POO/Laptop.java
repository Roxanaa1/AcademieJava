package com.example.lab3POO;


public class Laptop {

    private int memorie;
    private String marca;
    private String model;
    private int pretAchizitie;
    private int memorieStocare;


    public Laptop(int memorie, String marca, String model, int pretAchizitie, int memorieStocare) {
        this.memorie = memorie;
        this.marca = marca;
        this.model = model;
        this.pretAchizitie = pretAchizitie;
        this.memorieStocare = memorieStocare;
    }

    public Laptop() {
    }

    public void afisareMesajBunVenit() {
        System.out.println("Hello");
    }

    public void porneste() {
        System.out.println("Laptop ul porneste....");
    }

    public void setMemorie(int memorie) {
        if (memorie < 0 || memorie > 120) {
            System.out.println("Valoarea memoriei nu se afla intre interval");
        } else {
            this.memorie = memorie;
        }

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPretAchizitie(int pretAchizitie) {
        this.pretAchizitie = pretAchizitie;
    }

    public void setMemorieStocare(int memorieStocare) {
        this.memorieStocare = memorieStocare;
    }

    public int getMemorie() {
        return memorie;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getPretAchizitie() {
        return pretAchizitie;
    }

    public int getMemorieStocare() {
        return memorieStocare;//sau return this.memorieStocare
    }

    public String toString() {
        return "Laptop:" + this.memorie;
    }

    public static void main(String[] args) {
        Laptop laptopRoxi = new Laptop();
        //referinta=instantierea obiectului(obiectul)
        Laptop laptop1 = new Laptop(16, "HP", "VSHX", 23, 23);
        laptop1 = laptopRoxi;//referinta
        System.out.println("Memoria este:" + laptop1.getMemorie());
        System.out.println(laptop1.toString());//se apeleaza metoda toString de pe clasa Object
    }


}
