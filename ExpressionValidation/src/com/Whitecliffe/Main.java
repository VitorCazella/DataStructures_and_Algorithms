package com.Whitecliffe;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Stack<Character> stack = new Stack<Character>();

        System.out.println("Welcome to the expression validating program.\n\nEnter your expression:");
        String expression = scan.nextLine();
        System.out.println("Enter the opening character to validate: ");
        String open = scan.nextLine();
        System.out.println("Enter the closing character to validate: ");
        String close = scan.nextLine();

        boolean isInterrupted = false;

        for (int i = 0; i < expression.length(); i++){
            if (expression.charAt(i) == open.charAt(0)){
                stack.push(expression.charAt(i));
            } else if (expression.charAt(i) == close.charAt(0)) {
                if (stack.isEmpty()) {
                    System.out.println("The expression is Invalid.");
                    isInterrupted = true;
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty() && !isInterrupted) {
            System.out.println("The expression is validated.");
        }
        if (!stack.isEmpty()) {
            System.out.println("The expression is Invalid.");
        }

    }
}
