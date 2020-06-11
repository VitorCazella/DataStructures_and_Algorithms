package com.company;

/**
 *
 * @author lauren
 */
public class QuickSort {
    
    private CatalogueItem[] items;
    private int number;

    public void sort(CatalogueItem[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.items = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = items[low + (high-low)/2].getItemId();

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (items[i].getItemId() < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (items[j].getItemId() > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        CatalogueItem temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

 
    /* Prints the array */
    void printArray(CatalogueItem[] arr)
    {
        for (CatalogueItem catalogueItem : arr)
            System.out.print(
                    "id: " + catalogueItem.getItemId() + " "
                  + "name: " + catalogueItem.getItemName() + " "
                  + "category: " + catalogueItem.getCategory() + "\n");
        System.out.println("\n");
    }
    
    // Driver method to test above
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();

        QuickSort ob = new QuickSort();
        
        CatalogueItem[] arr = {
            new CatalogueItem( 3, "Life of Pi","Books"),
            new CatalogueItem( 7, "Deelongie 4 way toaster","Home and Kitchen"),
            new CatalogueItem( 2, "Glorbarl knife set","Home and Kitchen"),
            new CatalogueItem( 4, "Diesorn vacuum cleaner","Appliances"),
            new CatalogueItem( 5, "Jennie Olivier sauce pan","Home and Kitchen"),
            new CatalogueItem( 6, "This book will save your life","Books"),
            new CatalogueItem( 9, "Kemwould hand mixer","Appliances"),
            new CatalogueItem( 1, "Java for Dummies","Books"),
        };
        System.out.println("The Unsorted array is");
        ob.printArray(arr);
        
         //apply sort
        ob.sort(arr);
        System.out.println("The Quick Sorted array is");
        ob.printArray(arr);

        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        float milli = timeElapsed/1000000;

        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in microseconds : " + timeElapsed/1000);
        System.out.println("Execution time in milliseconds : " + milli);

        // Give an explanation about the difference between QuickSort and BubbleSort

    }
}
