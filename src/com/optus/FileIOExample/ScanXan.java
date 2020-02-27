package com.optus.FileIOExample;

import java.io.*;
import java.util.Scanner;
/*
Breaking Input into Tokens
By default, a scanner uses white space to separate tokens. (White space characters include blanks, tabs, and line terminators.
For the full list, refer to the documentation for Character.isWhitespace.) To see how scanning works, let's look at ScanXan,
a program that reads the individual words in xanadu.txt and prints them out, one per line.

 To use a different token separator, invoke useDelimiter(), specifying a regular expression. For example, suppose you wanted the token separator to be a comma, optionally followed by white space. You would invoke,

s.useDelimiter(",\\s*");

The ScanXan example treats all input tokens as simple String values
 */
public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}

