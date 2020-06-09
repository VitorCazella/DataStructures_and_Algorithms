package com.company;

public class Main {

    public static void main(String[] args) {
        Sorting sort = new Sorting();

        System.out.println("Hello user, this is a program created to Sort data inside of a array\n");
        String[] arr = {"Tama", "Amelia", "Kaos", "Karl"};

        sort.bubbleSort(arr);
        sort.showArray(arr);

    }



}
