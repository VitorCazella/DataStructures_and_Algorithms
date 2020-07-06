package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Welcome to the Simple Lotto ****");

        List<Player> players = new ArrayList<>();

        int[] tamaTicket = {3, 33, 17, 46, 47, 27};
        addPlayers(players, "Tama", tamaTicket);

        int[] bobTicket = {7, 19, 22, 23};
        addPlayers(players, "Bob", bobTicket);

        int[] caesarTicket = {33, 13};
        addPlayers(players, "Caesar", caesarTicket);

        System.out.println("Welcome...");
        for (Player player : players) {
            System.out.println(player.getName());
        }

        int count = 0;
        boolean weHaveAWinner = false;

        for (int randomNumber : printRandomNumbers(50, 50)) {
            if (weHaveAWinner) {
                break;
            }
            System.out.println("Announcing this week's winning ticket.... the number is " + randomNumber);
            count++;
            if (count == 8) {
                System.out.println("Bob has run out of money, so he no longer plays the lottery.");
                remove(players, "Bob");

            }
            for (Player player : players) {
                for (int ticket : player.getTicket_numbers()) {
                    if (ticket == randomNumber) {
                        System.out.println("\n****** WINNER ******\n" +
                                "Congratulations " + player.getName() + ".\n" +
                                "You have won");
                        weHaveAWinner = true;
                    }
                }
            }
        }

        System.out.println("\n\nIn this program was used a Observer Design Pattern");

    }

    public static void addPlayers(List<Player> list, String name, int[] numbers) {
        Player newPlayer = new Player(name, numbers);
        list.add(newPlayer);
    }

    public static void remove(List<Player> list, String name) {
        for (Player p : list) {
            if (p.getName() == name) {
                list.remove(p);
            }
        }
    }

    public static void printArrayList(List<Player> list) {
        for (Player p : list) {
            System.out.println(p.getName());
        }
    }

    public static final Random gen = new Random();

    public static int[] printRandomNumbers(int n, int maxRange) {
        assert n <= maxRange : "cannot get more unique numbers than the size of the range";

        int[] result = new int[n];
        Set<Integer> used = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {

            int newRandom;
            do {
                newRandom = gen.nextInt(maxRange + 1);
            } while (used.contains(newRandom));
            result[i] = newRandom;
            used.add(newRandom);
        }
        return result;
    }
}
