package Coding_Challenges_week2;
// importing package
import java.util.Scanner;
public class IMPORTS_displayMessage_challenge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);// Creating a Scanner object

        System.out.println(" Enter your name: ");
        String name = input.nextLine(); // Reads a line of text from the user

        System.out.println("Hello, " + name + "!");

        input.close();
    }
}
