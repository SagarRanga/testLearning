package com.ocean.learning.helloWorld;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(18);
        list.insert(20);
        list.insertAtStart(25);
        list.insertAt(2,55);
        list.insertAt(0,35);
        list.deleteAt(2);
        list.show();
    }

}
