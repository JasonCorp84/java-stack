package com.lambdaschool.javaStack;

import java.util.Arrays;

public class Stack
{
    // LIFO Functionality
    int maxSize;
    int top;
    String arr[];
    String textToPop;
    String[] current;

    public Stack(int n)
    {
        maxSize = n;
        arr =  new String[maxSize];
        top = 0;
    }

    public void print()
    {
        if(top == 0)
        {
            System.out.println("Your stack is empty");
        } else
        {
            for (int i = 0; i < top; i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public String pop()
    {
        if(top == 0)
        {
            System.out.println("your stack is already empty");
        } else
        {
            textToPop = arr[top];
            arr[top] = null;
            top--;
        }
        return textToPop;
    }
    public void push(String str)
    {
        if(top > 1000)
        {
            System.out.println("let's not do that, we don't have enough room");
        } else
        {
            arr[top] = str;
            top++;
        }

    }
    public void numOfItems()
    {
        if(top == 0)
        {
            System.out.printf("There are no items in your Stack");
        }
        else
        {
            System.out.println("'" + top +"'");
        }
    }

    @Override
    public String toString()
    {
        return "Stack{" +
                "maxSize=" + maxSize +
                ", top=" + top +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
