package com.company.Ej3;

public abstract class Figure {
    //Atributos
    private boolean colour;

    //Metodos
    public Figure (boolean colour){
        this.colour = colour;
    }

    public Figure (){

    }

    public boolean getColour() {
        return colour;
    }

    public abstract double area();
    
    public abstract double perimeter();
}
