package Coding_Challenges_week2;

public class VARIABLES_Account_challenge {
    //Attributes
    String accountNumber;
    double Balance;

    //Methods/behaviours
    void withdraw(double amount)
    {
        Balance = Balance - amount;
    }

    void deposit(double amount)
    {
        Balance = Balance + amount;
    }

    double checkBalance()
    {
        return Balance;
    }

    public static void main(String[] args){
        //Create instances/object from the bankAccount class

       VARIABLES_Account_challenge myAccount;//object declaration

        myAccount = new VARIABLES_Account_challenge();//object creation

        //call methods
        myAccount.deposit(4000);

        myAccount.withdraw(1500);

        System.out.println(myAccount.checkBalance());
    }
}

