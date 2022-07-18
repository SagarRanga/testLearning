package com.ocean.learning.helloWorld;

public class InheritanceBox {
    double l,w,h;

    public InheritanceBox() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    public InheritanceBox(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public InheritanceBox(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public InheritanceBox(InheritanceBox old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
