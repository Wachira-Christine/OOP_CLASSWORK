package RECURSION;

public class Sum {
    public static int sum(int x){
        //base case: if n is 1, the sum is 1
        if(x == 1){
            return 1;
        }else{
            //recursive case: n + sum of n - 1
            return x + sum(x-1);
        }
    }

    public static void main(String [] args){
        int answer = sum(10);

        System.out.println("Sum: " + answer);
    }
}
