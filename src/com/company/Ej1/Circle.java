package com.company.Ej1;

public class Circle {
    //Atributos
    private double radio = 1.0;
    private String colour = "red";

    //Metodos
    public Circle (){

    }

    public Circle (double radio, String colour){
        this.radio = radio;
        this.colour = colour;
    }

    public double area(){   //Area de un circulo
        double areaCircle = Math.PI * Math.pow(radio, 2);
        return areaCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", colour='" + colour + '\'' +
                '}';
    }

    public double getRadio (){
        return this.radio;
    }

    public String getColour (){
        return this.colour;
    }

    public double areaCylinder (double height){  //area del cilindro
        double areaCylinder = 2 * Math.PI * height + 2 * area();
        return areaCylinder;
    }
}
