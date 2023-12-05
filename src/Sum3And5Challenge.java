public class Sum3And5Challenge {
    public static void main(String[] args){

        int sumCount = 0;
        int numberCount = 0;

        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sumCount = sumCount +i;
                numberCount++;
                if(numberCount == 5){
                    break;
                }
            }
        }
        System.out.println("Found " + numberCount + " numbers");
        System.out.println("The sum of the found numbers is " + sumCount);
    }
}
