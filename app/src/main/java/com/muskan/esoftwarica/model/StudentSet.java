package com.muskan.esoftwarica.model;

import java.util.ArrayList;
import java.util.List;

public class StudentSet {
    private String StudentName;
    private String Age;
    private String Address;
    private String Gender;
    private static List<StudentSet> studentSetsList = new ArrayList<>();

    public StudentSet(String studentName, String age, String address, String gender) {
       this.StudentName = studentName;
        this.Age = age;
        this.Address = address;
        this.Gender = gender;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }



    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<StudentSet> getStudentSetsList() {
        return studentSetsList;
    }

    public void setStudentSetsList(List<StudentSet> studentSetsList) {
        this.studentSetsList = studentSetsList;
    }
}
