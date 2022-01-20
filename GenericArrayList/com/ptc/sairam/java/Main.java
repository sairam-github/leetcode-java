package com.ptc.sairam.java;

public class Main {
    
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(Integer.valueOf(1));

        System.out.println(myArrayList.size());
    }
}
