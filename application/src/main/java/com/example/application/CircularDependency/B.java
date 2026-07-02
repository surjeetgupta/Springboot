package com.example.application.CircularDependency;

public class B {
    private A a;
    public B(){
        this.a=new A();
    }
}
