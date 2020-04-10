package com.company.Ej2;

public class Student extends Person {
    //Atributos
    private int dateOfEntry;
    private float monthlyFee;
    private String career;

    //Metodos
    public Student (){

    }

    public Student (int dni, String name, String lastName, String email, String address, int dateOfEntry, float monthlyFee, String career){
        super(dni, name, lastName, email, address);
        this.career = career;
        this.dateOfEntry = dateOfEntry;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "dateOfEntry=" + dateOfEntry +
                ", monthlyFee=" + monthlyFee +
                ", career='" + career + '\'' +
                '}';
    }

    public float getMonthlyFee (){
        return this.monthlyFee;
    }
}
