package com.example.lab3POO;

class Number {
    private int n;

    Number() {
        this.n = 2;
    }

    public Number(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public Number adunare(Number number) {
        return new Number(this.n + number.getN());
    }

    @Override
    public String toString() {
        return "Number{" +
                "n=" + n +
                '}';
    }
}

public class MainNumar {
    public static void main(String[] args) {
        Number number1 = new Number(3);
        Number number2 = new Number();
        Number n3 = new Number();
        System.out.println("Adunarea este:" + n3.adunare(number2));
    }

}
