package ExceptionHandling;

import java.io.*;
public class Arithmetic_Exe {
    public static void main(String [] args){
        int no1 = 700;
        int no2 = 0;

        //exception handling
        try {
            //code that may throw an exception
            int answer = no1/no2;
            System.out.println("Answer: " +answer);
        }
        catch(ArithmeticException e){
            //Handles the error
            System.out.println(
                    "Error: Division by zero is not allowed"
            );
        }

        finally {
            System.out.println(
                    "Program continues after handling the exception");
        }
    }
}
