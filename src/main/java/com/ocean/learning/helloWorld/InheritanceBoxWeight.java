package com.ocean.learning.helloWorld;

public class InheritanceBoxWeight extends InheritanceBox {
    double weight;
    public InheritanceBoxWeight(){
        this.weight = -1;
    }

    public InheritanceBoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }
}
