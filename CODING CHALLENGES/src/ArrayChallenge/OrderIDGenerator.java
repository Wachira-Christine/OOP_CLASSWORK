package ArrayChallenge;
import java.util.Random;
public class OrderIDGenerator {
    public static void main(String[] args){
        Random random = new Random();
        String[] orderIDs = new String[10];

        for(int i= 0; i < orderIDs.length; i++){
            // Generate a random uppercase letter between A (65) and E (69)
            char prefix = (char)(random.nextInt(20) + 'A');

            //Generate a random number from 1 to 999 and format it with leading zeros
            int number = random.nextInt(999) + 1;
            String suffix = String.format("%03d", number);

            //combine prefix and suffix to form the OrderID
            orderIDs[i]= prefix + suffix;
        }
        // Print all generated OrderIDs
        for (String orderID : orderIDs){
            System.out.println(orderID);
        }
    }
}

//Random random = new Random();
//
//    -Creates a new instance of Java’s built-in Random class to generate random numbers.
//
//String[] orderIDs = new String[5];
//
//    -Declares an array to hold five OrderIDs.
//
//for (int i = 0; i < orderIDs.length; i++)
//
//    -A standard for loop that will run five times, once for each index in the array.
//
//char prefix = (char)(random.nextInt(5) + 'A');
//
//    -random.nextInt(5) generates a number from 0 to 4.
//
//    -Adding 'A' (which is 65 in ASCII) gives values between 65 and 69, corresponding to characters 'A' to 'E'.
//
//    -(char) casts the resulting int to a character.
//
//int number = random.nextInt(999) + 1;
//
//    -Generates a number between 1 and 999.
//
//    -random.nextInt(999) gives 0 to 998 → +1 shifts it to 1–999.
//
//String suffix = String.format("%03d", number);
//
//    -Formats the number as a three-digit string, adding leading zeros if necessary.
//
//    -For example, 7 becomes "007", 42 becomes "042".
//
//orderIDs[i] = prefix + suffix;
//
//    -Combines the letter and number into a full OrderID string (e.g., B073, E999, etc.).
//
//for (String orderID : orderIDs)
//
//    -A for-each loop that goes through each element in the array.
//
//System.out.println(orderID);
//
//    -Prints each generated OrderID to the console.