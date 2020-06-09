package undo;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Vitor A. Cazella
 */
public class Undo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> directions = new Stack<>();
        
        boolean exit = false;
        while(!exit){
            System.out.print("Press D to enter new direction, U to cancel last entry and E to quit the program\n");
            String response = scan.nextLine().toUpperCase();
            
            switch(response){
            case "D":
                newDirection(scan, directions);
                break;
            case "U":
                System.out.print("\""+ directions.pop() +"\" has been removed from the directions list\n");
                break;
            case "E":
                exit = true;
                break;
            default:
                System.out.print("\nPlease type a valid input.\n");
            }
            System.out.println("Bye...");
            
        }
        
    }

    public static void newDirection(Scanner scan, Stack<String> stack){
        System.out.print("Type in the direction: ");
        String direction = scan.nextLine();
        stack.push(direction);
        
        stack.forEach (i -> {
            System.out.println(i);
        });
    }
}
