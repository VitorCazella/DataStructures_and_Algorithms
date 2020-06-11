package com.company;

public class Main {

    public static Sorting sort = new Sorting();

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        Customer arr[] = {
                new Customer("Tama", 2, "Auckland"),
                new Customer("Amelia", 5, "Taranaki"),
                new Customer("Kaos", 3, "Hamilton"),
                new Customer("Karl", 4, "Papatoetoe"),
                new Customer("Carlos", 5, "Glenfield"),
                new Customer("Alicia", 2, "Whangarai"),
                new Customer("Zion", 2, "Wellington"),
                new Customer("Sara", 3, "Auckland"),
                new Customer("Bob", 4, "Papakura"),
                new Customer("Wiremu", 5, "Auckland")
        };

        System.out.println("Unsorted");
        ShowCustomers(arr);

        sort.bubbleSortByRate(arr);
        System.out.println("\nSorted by Rate");
        ShowCustomers(arr);

        sort.bubbleSortByName(arr);
        System.out.println("\nSorted by Name");
        ShowCustomers(arr);

        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        float milli = timeElapsed/1000000;

        System.out.println("\n\nExecution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in microseconds : " + timeElapsed/1000);
        System.out.println("Execution time in milliseconds : " + milli);

    }

    public static void ShowCustomers(Customer[] customer){
        for (Customer i : customer) {
            System.out.println(i.toString());
        }
    }

}
