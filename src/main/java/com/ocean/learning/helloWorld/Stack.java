package com.ocean.learning.helloWorld;

public class Stack {
    int stack[] = new int[5];
    int top = 0;
    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public void pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
    }

    public void show() {
        for (int i: stack) {
            System.out.print(i + " ");
        }
    }
}
