package com.example.application.CircularDependency;

public class A {
    private B b;

    public A(){
        this.b=new B();
    }
}

// here a is dependent on b and vice versa if we run this than satck overflow will happen due to recursive call of constructors.


