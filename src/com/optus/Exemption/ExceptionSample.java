package com.optus.Exemption;

import java.lang.ArithmeticException;

/*

https://www.tutorialspoint.com/java/java_exceptions.htm

Throwable class
	- extended by Exception -> handled by application
		- checked
			- compile time exceptions
			- IOException
			- SQLException
		-unchecked
			- runtime exceptions
			- RuntimeException - extends Throwable Class
			    - ArithmeticException extends RuntimeException
			-
	- extended by Error -> cannot be handled, JVM errors, environment errors, memory errors
*/
public class ExceptionSample {
    public static void main(String[] args){
        int i, j, k = 0;
        i = 8;
        j = 0;
        int ia[] = new int[4];
        try {
            //generates arithmetic exception, if divide by zero
            k = i / j;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception caught");

            try {
                for (int x = 0; x < ia.length; x++) {
                    ia[x] = x + 1;
                }
                //will throw exception since index is greater than length of array
                System.out.println(ia[10]);
            }
            catch(ArrayIndexOutOfBoundsException ee){
                System.out.println("Array index out of bounds");

                try {
                    throw new ArrayStoreException();
                }
                catch(Exception ue){
                    System.out.println("unknown exception" + ue);
                }
            }

        }
        catch(Exception e){
            System.out.println("unknown exception" + e);
        }
        System.out.println(k);
    }
}
