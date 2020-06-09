package com.company;

public class Sorting {
    public void bubbleSort(String[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n -1; i++){
            for (int j = 0; j < n -i -1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    //if (arr[j] > arr[j + 1]) {
                    // swap arr[j + 1] and arr[i]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public void showArray(String[] arr){
        for (String name: arr) {
            System.out.println(name);
        }
    }
}
