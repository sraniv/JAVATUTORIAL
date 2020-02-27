package com.optus.JavaString;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Sudha|Vis|32||||";
        //limit = -1 will get full length of tokens, ie. last 4 fields as retruned as null
        String[] tok = name.split("\\|", -1);
        for (int i = 0; i < tok.length; i++) {
            System.out.println("token=" + tok[i]);
        }
    }
}
