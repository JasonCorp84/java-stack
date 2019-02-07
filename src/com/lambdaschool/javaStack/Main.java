package com.lambdaschool.javaStack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack myStack =  new Stack(1000);
        myStack.numOfItems();
        myStack.push("item1");
        myStack.push("item2");
        myStack.push("item3");
        myStack.numOfItems();
        myStack.print();
        myStack.pop();
        myStack.print();
        myStack.pop();
        myStack.print();
        myStack.pop();
        myStack.print();
        myStack.numOfItems();
    }
}
