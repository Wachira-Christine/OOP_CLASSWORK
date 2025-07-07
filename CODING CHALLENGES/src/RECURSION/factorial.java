package RECURSION;

public class factorial {
    public static int factorial(int y){
        //base case
        if (y == 0){
            return 1;
        }else{
            //recursive case
            return y * factorial(y-1);
        }
    }

    public static void main(String[] args){
        int result = factorial(4);

        System.out.println("Factorial of 4 is: " + result);
    }
}
