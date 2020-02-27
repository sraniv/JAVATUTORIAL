package com.optus.Collections;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args){
        //Key is String which has hashCode() and Equals() already implemented, therefore, Student 3 is a duplicate of 2 is detected
        Map<String,Student> myHashMap = new HashMap<>();
        Student myStudent1 = new Student("Sudha", "Vish", 33);
        Student myStudent2 = new Student("Ram", "Vish", 44);
        Student myStudent3 = new Student("Ram", "Vish", 44);
        myHashMap.put("abc", myStudent1);
        myHashMap.put("efg", myStudent2);
        myHashMap.put("efg", myStudent3);

        System.out.println("myHashMap size=" + myHashMap.size());
        System.out.println(myHashMap.entrySet());

        //Create Map with Student as Key, and save Student object, BEFORE CREATING hashCode() and Equals() methods for Student,
        //3 records are created, once you specify above methods, then only 2 records are created, ie. duplicate  is detected
        Map<Student, Student> myStdMap = new HashMap<>();
        Student myStd1 = new Student("Sudha", "Vish", 33);
        Student myStd2 = new Student("Ram", "Vish", 44);
        Student myStd3 = new Student("Ram", "Vish", 44);
        Student myStd4 = new Student("Ram", "Vish", 45);
        myStdMap.put(myStd1, myStd1);
        myStdMap.put(myStd2, myStd2);
        myStdMap.put(myStd3, myStd3);
        myStdMap.put(myStd3, myStd4);
        System.out.println("myStdMap size=" + myStdMap.size());
        System.out.println(myStdMap.entrySet());

        Map<String, Student> myStdMap2 = new HashMap<>();
        Student my2Std1 = new Student("Sudha", "Vish", 33);

        Student my2Std2 = new Student("Ram", "Vish", 44);
        //System.out.println(myStdMap2.entrySet());
        Student my2Std3 = new Student("Ram", "Vish", 44);
        //System.out.println(myStdMap2.entrySet());
        Student my2Std4 = new Student("Ram", "Vish", 45);
        myStdMap2.put("Sudha", myStd1);
        System.out.println(myStdMap2.entrySet());
        System.out.println("get=" + myStdMap2.get("Sudha"));
        myStdMap2.put("Ram", myStd2);
        System.out.println(myStdMap2.entrySet());
        myStdMap2.put("Ram", myStd3);
        System.out.println(myStdMap2.entrySet());
        myStdMap2.put("Ram", myStd4);//value is replaced
        System.out.println(myStdMap2.entrySet());
        System.out.println("myStdMap2 size=" + myStdMap.size());

    }
}
