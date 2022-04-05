package Util;

import java.math.BigInteger;
import java.util.Set;

public class Various {

    public static int sumInteger(Set<Integer> listOfNumbers){
        int result = 0;
        for (Integer number: listOfNumbers) {
            result += number;
        }
        return result;
    }

    public static BigInteger getLargestInteger(Set<BigInteger> listOfNumbers){
        return listOfNumbers.stream().max(BigInteger::compareTo).orElse(null);
    }
}
