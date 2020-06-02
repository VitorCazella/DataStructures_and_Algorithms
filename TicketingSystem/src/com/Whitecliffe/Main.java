package com.Whitecliffe;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static Queue<Integer> queue = new Queue<Integer>();

    public static int count = 0;

    public static void main(String[] args) {

        Timer timer = new Timer();

        timer.schedule(new SalesAssistantTask(), 0, 5000); //run code in the SalesAssistantTask run() method every 5 seconds

        timer.schedule(new SalesCostumerTask(), 0, 3000);

    }
    public static class SalesAssistantTask extends TimerTask { //inner class

        public void run() {

            System.out.println("\nSales Assistant is ready to see the next customer.\n");

            if (!queue.isEmpty()){
                System.out.println("The customer with ticket number "+ queue.dequeue() +" will be seen\n");
                System.out.println("The customers with the following tickets are in the queue: " + queue.toString() +"\n");
            } else {
                System.out.println("There are no customers to see.\n");
            }

        }
    }

    public static class SalesCostumerTask extends TimerTask { //inner class

        public void run() {

            ++count;
            queue.enqueue(count);
            System.out.println("Customer with ticket "+ count +" is added to the queue.");

        }
    }
}
