package com.ocean.learning.helloWorld;

public class InheritanceBoxRunner {
    public static void main(String[] args){
//        InheritenceBox box = new InheritenceBox(4);
//        InheritenceBox box1 = new InheritenceBox(box);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        InheritanceBoxWeight boxWeight = new InheritanceBoxWeight();
        System.out.println(boxWeight.h + " " + boxWeight.weight);
        InheritanceBoxWeight boxWeight1 = new InheritanceBoxWeight(4,5,6,7);

    }
}
