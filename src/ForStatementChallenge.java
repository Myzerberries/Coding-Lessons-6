public class ForStatementChallenge {

    public static void main(String[] args){

        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");

        //For loop challenge below:

        int primeNumberCounter = 0;
        //In the for loop, the exit condition can include logical AND and logical OR in the expression.
        for(int i = 800; i <= 1000; i++){
            if(isPrime(i)){
                System.out.println("Found prime " + i);
                primeNumberCounter ++;
                if(primeNumberCounter == 3){
                    break;
                }
            }
        }

        System.out.println("Found " + primeNumberCounter + " Primes");
        //For loop challenge above.
    }

    public static boolean isPrime(int wholeNumber){

        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        //In this for loop example, the loop runs until the if statement is true, where it returns false.
        //If the for loop breaks out without the nested if statement becoming true, it will return true.

        for(int divisor = 2; divisor <= wholeNumber/2; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }

        return true;
    }



}
