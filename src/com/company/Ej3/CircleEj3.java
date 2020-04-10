package com.company.Ej3;

import com.company.Ej1.Circle;

public class CircleEj3 extends Figure{
    //Atributos
    private double radio;

    //Metodos
    public CircleEj3 (boolean colour, double radio){
        super(colour);
        this.radio = radio;
    }

    public CircleEj3 (){

    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = Math.PI * 2 * radio;
        return perimeter;
    }

    public String printCircle(){
        return "Tiene color: "+getColour()+"\nRadio: "+radio+"\nArea: "+area()+"\nPerimetro: "+perimeter();
    }
}
