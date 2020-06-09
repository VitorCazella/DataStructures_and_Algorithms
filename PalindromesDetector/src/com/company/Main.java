package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type the phrase: ");
        String phrase = scan.nextLine();
        String fragmented = phrase.replace(" ","").replace("-","").replace(".","").replace("!","").replace(".","").replace(":","").replace(",","").trim().toUpperCase();

        System.out.print(fragmented);

        boolean paliondromes = true;

        for (int i = 0; i < fragmented.length(); i++){
            System.out.print("\n");
            System.out.print(fragmented.charAt(i));
            System.out.print(fragmented.charAt(fragmented.length() - i - 1));
            if (fragmented.charAt(i) != fragmented.charAt(fragmented.length() -i -1)) {
                paliondromes = false;
            }
        }

        if (paliondromes) {
            System.out.print("\n\nIs a Paliondrome");
        } else {
            System.out.print("\n\nIs NOT a Paliondrome");
        }

        System.out.print("\n\n");
    }
}
