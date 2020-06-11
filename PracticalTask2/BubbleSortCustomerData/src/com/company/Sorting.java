package com.company;

public class Sorting {

    public void bubbleSortByName(Customer[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n -1; i++){
            for (int j = 0; j < n -i -1; j++) {
                if (arr[j].getName().compareTo(arr[j + 1].getName()) < 0) {
                    //if (arr[j] > arr[j + 1]) {
                    // swap arr[j + 1] and arr[i]
                    Customer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    public void bubbleSortByRate(Customer[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n -1; i++){
            for (int j = 0; j < n -i -1; j++) {
                if (arr[j].getRate() > arr[j + 1].getRate()) {
                    // swap arr[j + 1] and arr[i]
                    Customer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}
