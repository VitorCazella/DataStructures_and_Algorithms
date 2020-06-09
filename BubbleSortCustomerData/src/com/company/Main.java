package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Main {

    public static Sorting sort = new Sorting();

    public static void main(String[] args) {
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


    }

    public static void ShowCustomers(Customer[] customer){
        for (Customer i : customer) {
            System.out.println(i.toString());
        }
    }

}
