package com.company;

import com.company.Ej1.Cylinder;
import com.company.Ej2.Person;
import com.company.Ej2.Staff;
import com.company.Ej2.Student;
import com.company.Ej3.CircleEj3;
import com.company.Ej3.Rectangle;
import com.company.Ej3.Square;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1
        System.out.println("----Ejercicio 1----");

        //Creo un cilindro con constructor vacio
        Cylinder firstCylinder = new Cylinder ();

        //Lo muestro
        System.out.println(firstCylinder.toString());

        //Imprimo radio, altura, area, volumen del primer cilindro
        System.out.println("Radio: "+firstCylinder.getRadio());
        System.out.println("Height: "+firstCylinder.getHeight());
        System.out.println("Area: "+firstCylinder.area());
        System.out.println("Volume: "+firstCylinder.volume());
        System.out.println();

        //Creo segundo cilindro con parametros
        Cylinder secondCylinder = new Cylinder(3, "Blue", 5);

        //Lo muestro
        System.out.println(secondCylinder.toString());

        //Imprimo radio, altura, area, volumen del segundo cilindro
        System.out.println("Radio: "+secondCylinder.getRadio());
        System.out.println("Height: "+secondCylinder.getHeight());
        System.out.println("Area: "+secondCylinder.area());
        System.out.println("Volume: "+secondCylinder.volume());
        System.out.println();

        //Imprimo area y volumen del segundo cilindro
        System.out.println("Area: "+secondCylinder.areaCylinder(secondCylinder.getHeight()));
        System.out.println("Volumen: "+secondCylinder.volumeWithNewArea());
        System.out.println();

        //Imprimo el metodo toString pedido
        System.out.println(secondCylinder.newToString());

        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");

        //Ejercicio 2
        System.out.println("----Ejercicio 2----");

        //Inicializo 4 estudiantes
        Student firstStudent = new Student(24589633, "Apolo", "Creed", "apo@mail", "Saavedra 9854", 2005, 2000, "interiorismo");
        Student secondStudent = new Student(45365888, "Ivan", "Drago", "ivan@mail", "Luro 20145", 2008, 2500, "naval");
        Student thirdStudent = new Student(36782149, "Mister", "T", "mister@mail", "España 8922", 2010, 2200, "medicina");
        Student fourthStudent = new Student(54201982, "Rocky", "Balboa", "rocky@mail.com", "Colon 9876", 2017, 3000, "nuclear");

        //Inicializo 4 miembros del staff
        Staff firstStaff = new Staff(15369852, "Minerva", "Mcgonogall", "minerva@mail", "Peña 6666", 45000, "Mañana");
        Staff secondStaff = new Staff(19753951, "Severus", "Snape", "severus@mail", "Roca 5836", 52000, "Noche");
        Staff thirdStaff = new Staff(18563149, "Rubeus", "Hagrid", "rubeus@mail", "Matheu 9987", 40000, "Noche");
        Staff fourthStaff = new Staff(20553698, "Remus", "Lupin", "remus@mail", "Paso 6482", 50000, "Mañana");

        //Creo array y lo cargo
        ArrayList<Person> arrayList = new ArrayList<Person>();
        arrayList.add(firstStudent);
        arrayList.add(secondStudent);
        arrayList.add(thirdStudent);
        arrayList.add(fourthStudent);
        arrayList.add(firstStaff);
        arrayList.add(secondStaff);
        arrayList.add(thirdStaff);
        arrayList.add(fourthStaff);

        //Creo una persona auxiliar para mostrar el arreglo
        Person aux = new Person();
        aux.setArray(arrayList);
        aux.printArray();
        System.out.println();

        //Sumo y muestro cuanto es el total de las cuotas
        float totalFee = aux.totalFee();
        System.out.println("El total de las cuotas es: "+totalFee);

        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");

        //Ejercicio 3
        System.out.println("----Ejercicio 3----");

        //Creo un circulo y un rectangulo
        CircleEj3 firstCircle = new CircleEj3(true, 2.5);
        Rectangle firstRectangle = new Rectangle(false, 2, 3);
        System.out.println();

        //Los muestro
        System.out.println(firstCircle.printCircle());
        System.out.println();
        System.out.println(firstRectangle.printRectangle());
        System.out.println();

        //Creo un cuadrado
        Square firstSquare = new Square(true, 5, 5);
        System.out.println(firstSquare.printSquare());









    }
}
