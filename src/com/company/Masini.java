package com.company;

public abstract class Masini implements PretMasini {
    private int volumMotor;

    public double qntDissel() {
        return 0.0d;
    }

    public void pretMasini() {
        System.out.println("default");
    }

    public abstract double pret();

    public void setVolumMotor(int volumMotor) { this.volumMotor = volumMotor; }

    public  int getVolumMotor() { return volumMotor; }
}
