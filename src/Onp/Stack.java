package Onp;

import java.util.EmptyStackException;

public class Stack {

    private int lastElement;
    private String[] elements;

    public Stack(int size) {
        lastElement=0;
        this.elements = new String[size];
    }

    public boolean isEmpty(){
        return lastElement>0 ? false : true;
    }

    public void push(String newElement){
        if(lastElement < elements.length)
            elements[lastElement++] = newElement;
    }

    public String top(){
        if(lastElement<=0)
            throw new EmptyStackException();
        return elements[lastElement - 1];

    }

    public String pop(){
        if(lastElement<=0)
            throw new EmptyStackException();

        return elements[--lastElement];
    }


}
