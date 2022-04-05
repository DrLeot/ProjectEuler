package Problem_6;

public class SumSquareDifference {

    private static final int START = 1;
    private static final int END = 100;
    private static final int POWER = 2;


    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        for(int i = START; i <= END; i++){
            sumOfSquares += Math.pow(i,POWER);
            squareOfSum += i;
        }
        squareOfSum = (int)Math.pow(squareOfSum, POWER);

        System.out.println(squareOfSum-sumOfSquares);
    }
}
