package com.everis.willams.problems.strings.knowmust;

import com.sun.security.jgss.GSSUtil;

class Stack {
    private int [] arr;
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1);
        stack.push(2);

        stack.pop();
        stack.pop();

        stack.push(3);

        System.out.println("Elemento do topo: " + stack.peek());
        System.out.println("Tamanho da pilha: " + stack.size());

        stack.pop();

        if(stack.isEmpty()) System.out.println("Stack está vazia");
        else System.out.println("Stack não está vazia");
    }

}
