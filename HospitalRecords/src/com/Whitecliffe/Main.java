package com.Whitecliffe;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Patient> patient1 = new ArrayList<Patient>();
        Scanner scan = new Scanner(System.in);

        obtainRecords(patient1);

        boolean exit = false;
        do {
            System.out.println("\nPress S for search, Press E for exit");
            String response = scan.nextLine();
            if (response.equals("S") || response.equals("s")) {
                LookForID(patient1, scan);
            }else if (response.equals("E") || response.equals("e")) {
                System.out.println("Bye...");
                exit = true;
            }else if (response.equals("show")){
                ShowPatients(patient1);
            }else { System.out.println("Input 'S' or 'E'"); }

        } while(!exit);


    }

    public static void obtainRecords(ArrayList<Patient> patient){
        String path = "C:\\Users\\vitor\\Projects\\DataStructures_and_Algorithms\\HospitalRecords\\src\\com\\Whitecliffe\\ListOfPatients.txt";
        LineNumberReader lr = null;
        String[] oneRecord = new String[4];

        Patient pat;
        try {
            //using try-catch for exception handling to catch
            //possible errors with i/o operations
            FileReader inputStream = new FileReader(path);
            //FileReader reads the file’s contents
            lr = new LineNumberReader(inputStream);
            String str;
            while((str = lr.readLine())!= null) {
            //while the next line exists
                oneRecord = str.split(",");
                //dividing one file line by commas and assigning to array
                pat = new Patient(oneRecord[0], oneRecord[1],
                        oneRecord[2], oneRecord[3]);
                patient.add(pat); //adding patient to the ArrayList
            }
            System.out.println("**Patient records have been recorded successfully**");
        }
        catch(IOException ioe){
            System.out.println("IOException");
        }
    }

    public static void LookForID(ArrayList<Patient> patient, Scanner scan){
        System.out.println("\nEnter Patient ID to search");

        String ID = scan.nextLine();
        boolean found = false;

        for(Patient i : patient) {
            if (i.GetID().equals(ID)){
                found = true;
                System.out.println(i.toString());
                System.out.println("Would you like to remove the patient's record(s)?\n" + "Y or N?");
                String response = scan.nextLine();

                if (response.equals("Y") || response.equals("y")){
                    patient.remove(patient.indexOf(i));
                    //System.out.println(patient.indexOf(i));
                    System.out.println("Record(s) removed successfully");
                }else if (response.equals("N") || response.equals("n")){
                    System.out.println("Record(s) not removed");
                }
            }
        }
        if (!found) { System.out.println("ID Not Found!"); }

    }

    public static void ShowPatients(ArrayList<Patient> patient){
        for (Patient i : patient) {
            System.out.println("\n" + i.toString());
        }
    }

}
