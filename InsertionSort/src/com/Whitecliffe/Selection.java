package com.Whitecliffe;

public class Selection {

    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void bubbleSortString(String arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n -1; i++){
            for (int j = 0; j < n -i -1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // swap arr[j + 1] and arr[i]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n -1; i++){
            for (int j = 0; j < n -i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j + 1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}
