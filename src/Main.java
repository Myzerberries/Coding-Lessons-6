public class Main {

    public static void main(String[] args){
        //The for loop is designated as follows: for (init; expression; increment);
        //The init is the value that initializes the for loop.
        //The expression is the condition set that breaks the loop when FALSE.
        for (int counter = 1; counter <= 5; counter++){

            System.out.println(counter);
        }

        for(double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        //In Java and many other languages, "i" is commonly used in for loops as the iteration variable.
        //This can help with nested for loops, especially when using "j" and "k" to distinguish loops.
        //Break statements can be used to exit a for loop. Can be set up with if statement.
        //In the example below, a break will not execute the print since the break condition take us out of the for loop.


        for(double rate = 7.5; rate <= 10; rate+= 0.25){
            double interestAmount = calculateInterest(100.00, rate);
            if(interestAmount >= 8.5){
                break;
            }
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate){

        return(amount * (interestRate / 100));

    }

}
