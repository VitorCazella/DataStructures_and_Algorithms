package com.Whitecliffe;

public class Main {

    public static void main(String[] args) {

        Selection select = new Selection();

        int[] arr = { 3, 2, 6, 4, 8};

        showArray(arr);

        select.sort(arr);

        showArray(arr);

    }



    public static void showArray(int[] array) {
        for (int var : array) {
            System.out.println(var);
        }
    }

}