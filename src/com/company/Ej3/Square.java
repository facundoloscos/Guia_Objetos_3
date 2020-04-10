package com.company.Ej3;

public class Square extends Rectangle {
    //Metodos
    public Square (){

    }

    public Square (boolean colour, double height, double width){
        super(colour, height, width);
    }

    @Override
    public double area () {
        return getHeight() * getHeight();
    }

    @Override
    public double perimeter () {
        return getHeight() * 4;
    }

    public String printSquare (){
        return "Tiene color: "+getColour()+"\nLado: "+getHeight()+"\nArea: "+area()+"\nPerimetro: "+perimeter();
    }
}
