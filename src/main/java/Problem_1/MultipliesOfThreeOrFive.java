package Problem_1;
import Util.Math;
import Util.Various;
import java.util.HashSet;

/**
 * Defines multiplies of 2 and 5 from Constant LIMIT and sums them up.
 * Ignores Duplicates
 */
public class MultipliesOfThreeOrFive {

    public static int LIMIT = 1000;

    public static void main(String[] args){
        HashSet<Integer> result = (HashSet<Integer>) Math.multipliesOfFive(LIMIT);
        result.addAll(Math.multipliesOfThree(LIMIT));
        System.out.println(Various.sumInteger(result));
    }
}
