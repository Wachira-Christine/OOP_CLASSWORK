package Coding_Challenges_week2;
import java.util.Random;
import java.util.Scanner;

public class RANDOM_diceChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random dice = new Random();

        // Greet the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "! Let's play a dice game.");

        // Dice game
        int roll1 = dice.nextInt(6) + 1;
        int roll2 = dice.nextInt(6) + 1;
        int roll3 = dice.nextInt(6) + 1;
        int total = roll1 + roll2 + roll3;

        System.out.println("You rolled: " + roll1 + " + " + roll2 + " + " + roll3);

        if (roll1 == roll2 && roll2 == roll3) {
            System.out.println("You rolled triples! +6 bonus!");
            total += 6;
        } else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
            System.out.println("You rolled doubles! +2 bonus!");
            total += 2;
        }

        System.out.println("Your total score is: " + total);

        if (total >= 15) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }

        // Subscription reminder
        System.out.println("\nNow checking your subscription status...");
        int daysLeft = dice.nextInt(12); // 0 to 11
        int discount = 0;

        if (daysLeft < 1) {
            System.out.println("Your subscription has expired.");
        } else if (daysLeft == 1) {
            discount = 20;
            System.out.println("Your subscription expires in 1 day. Renew now and save " + discount + "%!");
        } else if (daysLeft <= 5) {
            discount = 10;
            System.out.println("Your subscription expires in " + daysLeft + " days. Renew now and save " + discount + "%!");
        } else {
            System.out.println("Your subscription is still active. No action needed.");
        }

        System.out.println("\nThanks, " + name + "! Goodbye.");
        scanner.close();
    }
}
