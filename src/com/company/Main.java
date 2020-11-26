package com.company;

public class Main {

    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "Negru", 2014);
        Audi audi = new Audi("Audi", "Negru", 2020);
        Mercedes mercedes = new Mercedes("Mercedes","Negru", 2015);


        bmw.setVolum(2.3d);
        audi.setVolum(1.6d);
        mercedes.setVolum(1.2d);
        System.out.println(bmw.qntDissel());
        System.out.println(audi.qntDissel());
        System.out.println(mercedes.qntDissel());
        bmw.pretMasini();
        audi.pretMasini();
        mercedes.pretMasini();
    }

}
