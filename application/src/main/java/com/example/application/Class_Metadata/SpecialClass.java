package com.example.application.Class_Metadata;

import com.example.application.SpringCore.OrderService;
import com.example.application.SpringCore.PaymentService;

public class SpecialClass {
    public static void main(String args[]) {
        PaymentService payment=new PaymentService();
        OrderService order=new OrderService(payment);
        order.placeOrder();
        System.out.println("Hello World");

        Student s1=new Student();

        //Class holds metadata of the class
        Class<Student> c1=Student.class;
        //c1 stores metadata of Student class
    }
}

/*
  C1 stores these data and more :-
  class name
  fields
  constructors
    methods
*/

//Reflection API

class Student{
    private String name;
    private int age;

    public Student() {

    }

    public void attendance(){

    }

    public void func2(){

    }
}
