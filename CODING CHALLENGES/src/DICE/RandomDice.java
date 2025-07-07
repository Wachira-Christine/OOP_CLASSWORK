package DICE;

import java.util.Random;
import java.util.Scanner;
public class RandomDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of  times you want to roll the random dice");
        int n = sc.nextInt();
        Random rand = new Random();
        int[] dice = new int[n];
        for (int i = 0; i < n; i++) {
            dice[i] = rand.nextInt(6) + 1;
            System.out.printf("%d ", dice[i]);

        }



    }
}