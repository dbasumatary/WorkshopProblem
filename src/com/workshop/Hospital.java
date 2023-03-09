package com.workshop;

import java.util.ArrayList;
import java.util.List;

//Program to store the patient details in arraylist 'patients'
public class Hospital {
    private String name;

    //declaring private arraylist
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    //To perform stream operations in main class this method is created, and it returns the arraylist
    public List<Patient> getPatients() {
        return patients;
    }

    //To store all the details of patients entered using arraylist
    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    //getter
    public String getName() {
        return name;
    }


}

















/*
package com.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

//Create multiple Hospitals -> Create Patients with details(name, age, phoneNumber,city,state, department) ->
//  Add multiple Patients in each Hospital and use two stream function.

class Contacts {

    public String name, age, phoneNumber, city, state, department;

    public Contacts(String name, String age, String phoneNumber, String city, String state, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
    class Hospital {
    Scanner scanner= new Scanner(System.in);
    public ArrayList<Contacts> details = new ArrayList<>();
    String name, age, phoneNumber, city, state, department;
    static String hospitalName;

    public Hospital(String hospitalName){
        this.hospitalName = hospitalName;
        this.details = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }


    public Contacts inputDetails(){
        System.out.println("Enter the name: ");
        name = scanner.next();
        System.out.println("Enter the age: ");
        age = scanner.next();
        System.out.println("Enter the phone number: ");
        phoneNumber = scanner.next();
        System.out.println("Enter the city: ");
        city = scanner.next();
        System.out.println("Enter the state: ");
        state = scanner.next();
        System.out.println("Enter the department: ");
        department = scanner.next();

        Contacts contacts = new Contacts(name,age,phoneNumber,city,state,department);
        details.add(contacts);
        return contacts;
    }
    public void addPeople(){
        System.out.println("How many patients do you want to add: ");
        int number = scanner.nextInt();
        System.out.println("Enter the name: ");
        String nameEnter = scanner.next();

        Optional<Contacts> checkPatient = details.stream().filter(x -> nameEnter.equals(name)).findFirst();

    }

    public void display(){
        for (Contacts patient : details){
            System.out.println(patient);
        }
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital(hospitalName);
        Scanner scanner= new Scanner(System.in);
        List<Hospital> hospitals = new ArrayList<>();
        System.out.println("How many hospitals are required : ");
        int numOfHospitals = scanner.nextInt();
        for (int i = 0; i < numOfHospitals; i++){
            hospitals.add(new Hospital(scanner.next()));
        }
        //hospitals.stream().forEach(hospital1 -> {details.stream()} );

        hospital.inputDetails();
        hospital.addPeople();

    }

}

*/
