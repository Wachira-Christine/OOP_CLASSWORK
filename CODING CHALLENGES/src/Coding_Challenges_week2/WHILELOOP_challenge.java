package Coding_Challenges_week2;

public class WHILELOOP_challenge {
    //Code is meant to carry out a countdown from 10 to 0 and display a happy new years message
    public static void main (String[] args) throws InterruptedException{
        int seconds = 10;

        while(seconds > 0){
            System.out.println(seconds + "..." );
            Thread.sleep(1000);
            seconds--;
        }

        System.out.println("Happy New Year!!!");
    }
}
