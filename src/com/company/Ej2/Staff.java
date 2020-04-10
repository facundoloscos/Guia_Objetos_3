package com.company.Ej2;

public class Staff extends Person {
    //Atributos
    private float salary;
    private String shift;

    //Metodos
    public Staff (){

    }

    public Staff (int dni, String name, String lastName, String email, String address, float salary, String shift){
        super(dni, name, lastName, email, address);
        this.salary = salary;
        this.shift = shift;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" +
                "salary=" + salary +
                ", shift='" + shift + '\'' +
                '}';
    }

    public float anualSalary (){
        float anualSalary = salary * 12;
        return anualSalary;
    }
}
