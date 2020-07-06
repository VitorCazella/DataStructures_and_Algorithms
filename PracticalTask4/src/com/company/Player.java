package com.company;

public class Player {

    private static int count =0;
    private int id = 0;
    private String name = "";
    private int[] ticket_numbers = {};

    public Player(String name, int[] ticket){
        this.id = count;
        this.name = name;
        this.ticket_numbers = ticket;

        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getTicket_numbers() {
        return ticket_numbers;
    }
}
