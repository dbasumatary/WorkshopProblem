package com.workshop;

//Pojo class
public class Patient {
    private String name;
    private int age;
    private String phoneNumber;
    private String city;
    private String state;
    private String department;

    public Patient(String name, int age, String phoneNumber, String city, String state, String department) {
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

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString(){
        return "[Name - " + name + "Age - " + age + "Phone - " + phoneNumber + "City - " + city + "State - " + state + "Department - " + department +"]";
    }
}

