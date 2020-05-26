package com.Whitecliffe;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Test test_demo = new Test();

        Scanner input = new Scanner(System.in);


        String name = "Vitor";
        int age = 21;

        System.out.println("Hi "+ name +", u are old as hell, "+ age +" years old!");

        System.out.println("For loop:");
        for(int i=1; i < 10; i++){
            System.out.println("i = "+ i);
        }

          /* Example of while loop */
        System.out.println("While loop: ");
        int i = 0;
        do {
            System.out.println("i = "+ i);
           i++;
        }while(i < 10);

        System.out.println(generateRandomNumber());

    }


    static void getRectangleArea(Scanner input){

        System.out.println("Type the width: ");
        int width = input.nextInt();
        System.out.println("Type the length: ");
        int length = input.nextInt();

        int area = width * length;

        System.out.println("The Rectangle area is: "+ area);
    }

    static void guessNumber(Scanner input) {
        Random random = new Random();

        int low = 1;
        int high = 10;
        int numberOfTurns = 5;
        int turnsTaken = 0;
        int result = random.nextInt(high - low) + low;
//        System.out.println(result);
        while (turnsTaken < numberOfTurns) {
            System.out.println("Please choose a number between " + low + " and " + high);
            int userChoice = input.nextInt();
            if (userChoice == result) {
                System.out.println("correct");
                break;
            }
            turnsTaken++;
        }
    }

    static int generateRandomNumber(){
        Random random = new Random();

        return random.nextInt(11);
    }

}
