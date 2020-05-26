package com.gofly;

import java.util.ArrayList;

// import static java.lang.Character.isLetter;
import static java.lang.Character.*;

public class Main {

    public static void main(String[] args) {

        /**
         * some info you need to know about using char method:
         * accord to your need, 1) you can import a specific method (import static java.lang.Character.isLetter)
         * or 2) you can import all char methods (import static java.lang.Character.*)
         *
         * The difference between them: for the '1)' case, you can only use isLetter method
         * for '2)' case, you can use any char method as you want.
         */
        char letter = 'c';

        System.out.println(isLetter(letter));
        System.out.println(isDigit(letter));

        

        String strDmo = "Welcome to Java World";

        //to get a letter at a specific position within String 'strDemo'
        //please be aware that the return value of this method is 'char' type
        strDmo.charAt(2);

        //because of the data type of charAt's return value, below code is possible
        isLetter(strDmo.charAt(2));

        //to get the length of this String 'strDemo'
        strDmo.length();

        //change this String to upper case
        strDmo.toUpperCase();


        Human humanDemo = new Human("John", 234561, "9 kelvin road");
        Human humanDemo2 = new Human("Jack", 345678, "9 heaven road");


        System.out.println(humanDemo.getAddress());
        humanDemo.setAddress("12 Terairor St");
        System.out.println(humanDemo.getAddress());

        int phoneNumber = humanDemo2.getSpecificPersonPhone();
        System.out.println(phoneNumber);

        Man menDemo = new Man("Kelly", 875849, "87 vitory St", 2345.89, "AI", 85.45);

        System.out.println(menDemo.getAddress());

        menDemo.updateSalary(7685.45);

        System.out.println(menDemo.getSalary());

        System.out.println(menDemo.name);
        menDemo.setAddress("98 Hey Road");
        System.out.println(menDemo.getAddress());

//int, bool, String, double -- primitive data type
        //class, Integer
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(23);
        numList.add(35);
        numList.add(47);
        numList.add(9);

        for(Integer num: numList){
            System.out.println(num);
        }

        ArrayList<Human> humList = new ArrayList<Human>();

        humList.add(humanDemo);
        humList.add(humanDemo2);

        for(Human man : humList) {
            System.out.println(man.getAddress());
        }
    }
}
