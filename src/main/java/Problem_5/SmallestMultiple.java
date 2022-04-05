package Problem_5;

public class SmallestMultiple {

    private static final int ENDDIVISOR = 20;

    public static void main(String[] args) {

        for(int i = 1; i <= Integer.MAX_VALUE; i++){
            if(isEvelnlyDivisible(i)){
                // found one
                System.out.println(i);
                return;
            }


        }
    }

    private static boolean isEvelnlyDivisible(int number){
        for(int divisor = 1; divisor <= ENDDIVISOR; divisor++){
            if(!(Math.abs(number%divisor) == 0)){
                return false;
            }
        }
        return true;
    }
}
