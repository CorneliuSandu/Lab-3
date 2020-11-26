package com.company;

public class Mercedes extends Masini{
    private String marca;
    private String culoarea;
    private int anul;
    private double volum;

    public Mercedes(String marca, String culoarea, int anul) {

        this.marca = marca;
        this.culoarea = culoarea;
        this.anul = anul;
    }

    @Override
    public void pretMasini() {
        System.out.println(pret());;
    }

    public double pret(){
        return 3.14d * getAnul();
    }

    public double qntDissel() {
        return 113.23 * getVolum();
    }

    public String println() {
        return ("Marca: " + this.marca + ", Culoarea: " + this.culoarea + ", Anul: " + this.anul);
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }
    private void setCuloarea(String culoarea) {
        this.culoarea = culoarea;
    }
    private void setAnul(int anul) {
        this.anul = anul;
    }

    public  String getMarca() {return marca;}
    public  String getCuloarea() {return culoarea;}
    public  int getAnul() {return anul;}

    public void setVolum(double volum) {
        this.volum = volum;
    }

    public double getVolum() {
        return volum;
    }
}
