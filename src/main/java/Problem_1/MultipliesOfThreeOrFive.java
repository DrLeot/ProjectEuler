package Problem_1;
import Util.Mathmatics;
import Util.Various;
import java.util.HashSet;

/**
 * Defines multiplies of 2 and 5 from Constant LIMIT and sums them up.
 * Ignores Duplicates
 */
public final class MultipliesOfThreeOrFive {

    public static int LIMIT = 1000;

    public static void main(String[] args){
        HashSet<Integer> result = (HashSet<Integer>) Mathmatics.multipliesOfFive(LIMIT);
        result.addAll(Mathmatics.multipliesOfThree(LIMIT));
        System.out.println(Various.sumInteger(result));
    }
}
