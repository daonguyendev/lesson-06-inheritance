package com.codegym.override;

public class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    protected void getName() {
        super.getName();
//        System.out.println("I am a rectangle object");
    }
}
