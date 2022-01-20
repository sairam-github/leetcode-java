package com.ptc.sairam.java;

/**
 * MyArrayList
 */
public class MyArrayList<T> {

    private int size = 0;
    private Object[] content;

    public MyArrayList() {

        this.content = new Object[10];
    }

    public MyArrayList(int size) {

        this.content = new Object[size];
    }

    public void add(Object obj) {

        this.content[size++] = obj;
    }

    public Object get(int index) {

        if (index < this.size) {
            return this.content[index];
        }

        throw new IndexOutOfBoundsException("Invalid array index.");
    }
    
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
} 