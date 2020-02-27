package com.optus.FileIOExample;


import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        //FileInputStream in = null;
        //FileOutputStream out = null;
        /*When you open your file with path hello.txt, the file hello.txt should be in the same directory of where you execute the
        java command, that is the working directory.
        And you can use the following code to print the working directory when you run a Java program:*/
        System.out.println("user.dir=" + System.getProperty("user.dir"));
        //data file needs to reside in same directory as what is returned by above

        String ipath = "C:\\Users\\rvish\\IdeaProjects\\JAVATUTORIAL\\xanadu.txt";
        File   infile = new File(ipath);

        FileInputStream fileInputStream = null;
        //File infile = new File("C:\\Users\\rvish\\IdeaProjects\\JAVATUTORIAL\\xanadu.txt");

        String opath = "C:\\Users\\rvish\\IdeaProjects\\JAVATUTORIAL\\byteout.txt";
        File outfile = new File(opath);
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(infile);
            fileOutputStream = new FileOutputStream(outfile);
            int c;

            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Exception=" + e.getMessage());
            System.out.println("Exception cause=" + e.getCause());
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}

