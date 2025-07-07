package ArrayChallenge;

public class ArrayChallenge {
    public static void main(String[] args){
        String[] orderIds = {"B123","C234", "A345", "C15", "B177","G3003", "C235", "B179"};

        for(String item:orderIds){
            if(item.startsWith("B")){
                System.out.println(item);
            }
        }
    }
}
//EXERCISE 1-Explanation
//
//    public class ArrayChallenge
//
//        -This defines a class named ArrayChallenge.
//
//        -In Java, all code must be inside a class.
//
//    public static void main(String[] args)
//
//        -This is the entry point of any Java application.
//
//       -When the program runs, execution starts here.
//
//    String[] orderIds = {...}
//
//        -Declares an array of strings called orderIds.
//
//        The array holds a list of order identifiers like "B123", "C234", etc.
//
//    for (String item : orderIds)
//
//        -This is a for-each loop that goes through each element in the orderIds array.
//
//        -On each loop, item holds one string from the array.
//
//    if (item.startsWith("B"))
//
//        -This checks if the current string (item) starts with the letter "B".
//
//        -The startsWith() method returns true if the string begins with the specified prefix.
//
//    System.out.println(item);
//
//        -If the condition is true, this line prints the string to the console.
