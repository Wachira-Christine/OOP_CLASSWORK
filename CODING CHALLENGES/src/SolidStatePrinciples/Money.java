package SolidStatePrinciples;


    //Without liskov principle


    public abstract class Money  {
        int amount;
        char currency;

        public abstract void convert_currency();
    }

    class Payment extends Money {
        @Override
        public void convert_currency() {
            // this violates Liskov because its Changing expected behavior by adding onto it

        }
    }





    //Liskov principle
// Correctly following Liskov Substitution Principle
    public abstract class Money  {
        int amount;
        char currency;

        public abstract void convert_currency();
    }

    class Payment extends Money {
        @Override
        public void convert_currency() {
            // Following Liskov: Implements expected behavior
            System.out.println("Converting currency for payment.");
        }
    }

//The class payment extends from money without adding onto any functionality.
// It simply implements the abstract method convert_currency.

