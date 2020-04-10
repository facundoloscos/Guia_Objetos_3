package com.company.Ej2;

import java.util.ArrayList;

public class Person {
    //Atributos
    private int dni;
    private String name;
    private String lastName;
    private String email;
    private String address;
    private ArrayList<Person> array= new ArrayList<Person>();

    //Metodos
    public Person (){

    }

    public Person (int dni, String name, String lastName, String email, String address){
        this.address = address;
        this.dni = dni;
        this.email = email;
        this.lastName = lastName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setArray(ArrayList<Person> array) {
        this.array = array;
    }

    public void printArray (){  //funcion que muestra el arreglo de personas
        for (int i=0; i<array.size(); i++){
            if (array.get(i) instanceof Student){
                Student aux = (Student) array.get(i);
                System.out.println(aux.toString());
            }else{
                Staff otherAux = (Staff) array.get(i);
                System.out.println(otherAux.toString());
            }
        }
    }

    public float totalFee (){  //funcion que suma las cuotas
        float total = 0;
        for (int i=0; i<array.size(); i++){
            if (array.get(i) instanceof Student){
                total += ((Student) array.get(i)).getMonthlyFee();
            }
        }
        return total;
    }
}
