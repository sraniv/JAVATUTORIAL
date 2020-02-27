package com.optus.Collections;

import java.util.Objects;

public class Student {
    private String fname;
    private String lname;
    private int age;
    public Student(String fname, String lname, int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(fname, student.fname) &&
                Objects.equals(lname, student.lname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, age);
    }
}
