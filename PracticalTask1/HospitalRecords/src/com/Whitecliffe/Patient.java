package com.Whitecliffe;

public class Patient {
    protected String patientID = "";
    protected String name = "";
    protected String check_in_date = "";
    protected String assigned_personal = "";

    public Patient(String patientID, String name, String check_in_date, String assigned_personal){
        this.patientID = patientID;
        this.name = name;
        this.check_in_date = check_in_date;
        this.assigned_personal = assigned_personal;

    }

    public String toString(){
        String display = ("Patient ID: "+ patientID +"\n" +
                "Name: "+ name+ "\n" +
                "Check In Date: "+ check_in_date +"\n" +
                "Assigned Medical Personnel: "+ assigned_personal);

        return display;
    }

    public String GetID(){ return patientID; }
}
