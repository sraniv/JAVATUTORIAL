package com.optus.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args){
        //create ArryList<>
        ArrayList<String> al = new ArrayList<>();
        //add elements to arrayList
        al.add("Sudha");
        al.add("Ramesh");
        al.add("Sachin");

        System.out.println("*********SIMPLY PRINT WHOLE LIST******");
        System.out.println(al);

        //Iterate over elements using Iterator Interface
        System.out.println("***********USING ITERATOR INTERFACE**************");
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("********USING FOR EACH LOOP*************");
        for (String obj:al){
            System.out.println(obj);
        }
    }
}
