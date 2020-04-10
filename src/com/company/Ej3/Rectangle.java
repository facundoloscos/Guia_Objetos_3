package com.company.Ej3;

public class Rectangle extends Figure {
    //Atributos
    private double height;
    private double width;

    //Metodos
    public Rectangle (boolean colour, double height, double width){
        super(colour);
        this.height = height;
        this.width = width;
    }

    public Rectangle (){

    }

    @Override
    public double area() {
        double area = height * width;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * (height + width);
        return perimeter;
    }

    public String printRectangle(){
        return "Tiene color: "+getColour()+"\nAltura: "+height+"\nBase: "+width+"\nArea: "+area()+"\nPerimetro: "+perimeter();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
