package com.optus.Collections;

import java.util.*;

class Cricketer implements Comparable<Cricketer>{
    String name;
    int id;

    @Override
    public String toString() {
        return "Cricketer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    Cricketer(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Cricketer o) {
        if (this.id < o.id){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class CollectionExamples {
    public static void main(String[] args){
        //Collections can only hold objects not primitives
        List<Integer> integers = new ArrayList<Integer>();
        //below allowed because of auto boxing
        integers.add(5);//new Integer (5)

        int i;
        int a[] = {1,2,3,4,5};
        //Arrays

        //ArrayList
        List<String> batsmen = new ArrayList<String>();

        //adds at the end of list
        batsmen.add("Sachin");//[Sachin]
        batsmen.add("Ramesh");//[Sachin, Ramesh]
        batsmen.add(0, "Sudha");//[Sudha,Sachin,Ramesh]
        //list allows duplicates
        batsmen.add("Sachin");//[Sudha,Sachin,Ramesh,Sachin]

        System.out.println(batsmen.indexOf("Sachin"));//1, only first occurent
        System.out.println(batsmen.size());//4
        System.out.println(batsmen.contains("Sudha"));//true

        //Iterating around a list only when you want to modify a list
        //otherwise use foreach()
        Iterator<String> arraylistIterator = batsmen.iterator();
        while(arraylistIterator.hasNext()){
            String str = arraylistIterator.next();
            if (str.equals("Sachin")){
                System.out.println("Found him");//prints twice
            }
        }
        System.out.println(batsmen);//[Sudha, Sachin, Ramesh, Sachin]
        batsmen.remove("Sachin");//[Sudha, Ramesh, Sachin] - removes only first occurrence
        System.out.println(batsmen);
        batsmen.remove(0);//[Ramesh, Sachin]
        System.out.println(batsmen);

        //Sorting Colloections
        List<String> numbers = new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        System.out.println(numbers);//[one,two,three,four]

        //Sorting by default sorts alphabetically
        Collections.sort(numbers);
        System.out.println(numbers);//[five, four, one, three, two]

        List<Cricketer> cricketers = new ArrayList<Cricketer>();
        cricketers.add(new Cricketer("Bradman", 9996));
        cricketers.add(new Cricketer("Sachin", 14000));
        cricketers.add(new Cricketer("Dravid", 12000));
        cricketers.add(new Cricketer("Ponting", 11000));
        System.out.println(cricketers);
        //Cricketer class must implement Comparable Interface to use sort(cricketers)
        Collections.sort(cricketers);
        System.out.println(cricketers);

        //sets
        //Sets do not allow duplicates
        //HashSet doesn't support ordering
        Set<String> hashset = new HashSet<String>();

        hashset.add("Sachin");
        System.out.println(hashset);//[Sachin]
        hashset.add("Dravid");
        System.out.println(hashset);//[Sachin,Dravid]
        hashset.add("Sachin");//returns false, since sachin is a duplicate
        System.out.println(hashset);//[Sachin,Dravid]

        //TreeSet stores objects in Sorted Order
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("Sachin");
        System.out.println(treeSet);//[Sachin]
        treeSet.add("Dravid");
        System.out.println(treeSet);//[Dravid, Sachin]
        treeSet.add("Ganguly");
        System.out.println(treeSet);//[Dravid,Ganguly, Sachin]
        treeSet.add("Sachin");//duplicate doesn't get added
        System.out.println(treeSet);//[Dravid,Ganguly, Sachin]
    }
}
