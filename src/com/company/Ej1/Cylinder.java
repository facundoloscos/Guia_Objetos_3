package com.company.Ej1;

public class Cylinder extends Circle {
    //Atributos
    private double height;

    //Metodos
    public Cylinder (){
        this.height = 1.0;
    }

    public Cylinder (double radio, String colour, double height){
        super(radio, colour);
        this.height = height;
    }

    public double volume (){  //Volumen del primer inciso
        double volumeCylinder = Math.PI * Math.pow(getRadio(), 2) * height;
        return volumeCylinder;
    }

    @Override
    public String toString() {
        return super.toString() + "Cylinder{" +
                "height=" + height +
                '}';
    }

    public double getHeight(){
        return this.height;
    }

    public double volumeWithNewArea (){  //Volumen del ultimo inciso
        double volumeCylinder = super.area() * height;
        return volumeCylinder;
    }

    public String newToString (){
        return "Cilindro: subclase de "+super.toString()+" altura: "+getHeight();
    }
}
