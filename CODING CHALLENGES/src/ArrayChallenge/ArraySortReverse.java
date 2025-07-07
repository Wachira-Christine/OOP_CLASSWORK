package ArrayChallenge;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main (String[] args) {
        //Initial array of pallet IDs
        String[] pallets = {"B14", "A11", "B12", "A13"};

        //Sort the arrays in ascending order
        System.out.println("Sorted Array");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }

        //Reverse the sorted array
        System.out.println("\nReversed ...");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList); //Reverse the order
        for (String pallet : palletList) {
            System.out.println("--" + pallet);
        }
    }
}

//EXERCISE 3 - Explanation
//
//    Arrays.sort(pallets)
//    -Sorts the array alphabetically (lexicographically).
//
//    Collections.reverse(...)
//    -Reverses the order of the sorted list.
//
//    Arrays.asList(...)
//    -Converts the array into a list so that it can be reversed using Collections.reverse.