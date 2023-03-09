//Create multiple Hospitals -> Create Patients with details(name, age, phoneNumber,city,state, department) ->
//Add multiple Patients in each Hospital and use two stream function.

package com.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating details for hospital and storing it in arraylist
        List<Hospital> hospitals = new ArrayList<>();
        System.out.print("Enter the number of hospitals to add: ");
        int numHospitals = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numHospitals; i++) {
            System.out.print("\nEnter the name of hospital " + i + ": ");
            String hospitalName = scanner.nextLine();

            //Creating a new object of Hospital class and adding it in arraylist
            Hospital hospital = new Hospital(hospitalName);
            hospitals.add(hospital);

            // Adding patients to the respective hospital
            System.out.print("Enter the number of patients to enter in " + hospitalName + ": ");
            int numberOfPatients = scanner.nextInt();
            scanner.nextLine();

            //Using scanner class to enter the patient details
            for (int j = 1; j <= numberOfPatients; j++) {
                System.out.println("\nPlease enter the following details for patient " + j + ":");
                System.out.print("Name: ");
                String patientName = scanner.nextLine();

                System.out.print("Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Phone Number: ");
                String phoneNumber = scanner.nextLine();

                System.out.print("City: ");
                String patientCity = scanner.nextLine();

                System.out.print("State: ");
                String patientState = scanner.nextLine();

                System.out.print("Department: ");
                String department = scanner.nextLine();

                //Creating a new object of Patient class and add this in the object of Hospital class
                Patient patient = new Patient(patientName, age, phoneNumber, patientCity, patientState, department);
                hospital.addPatient(patient);
            }
        }

        // Displaying the patient details for each hospital using two streams (.stream() and .forEach())
        //The arraylist hospitals is where we stored all patient details
        for (Hospital hospital : hospitals) {
            System.out.println();
            System.out.println("\nPatients in " + hospital.getName() + ":");
            System.out.println("-----------------------");

            //(.stream) is a sequence of objects that supports various methods which can be pipelined.
            //(.forEach) method will iterate through each element in the stream
            hospital.getPatients().stream()
                    .forEach(patient -> {
                        System.out.print("Name: " + patient.getName()+ ", ");
                        System.out.print("Age: " + patient.getAge()+ ", ");
                        System.out.print("Phone Number: " + patient.getPhoneNumber()+ ", ");
                        System.out.print("City: " + patient.getCity()+ ", ");
                        System.out.print("State: " + patient.getState()+ ", ");
                        System.out.print("Department: " + patient.getDepartment());
                        System.out.println();
                    });
        }
    }
}

