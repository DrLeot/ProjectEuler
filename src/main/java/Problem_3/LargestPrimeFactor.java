package Problem_3;

import Util.*;

import java.math.BigInteger;

public final class LargestPrimeFactor {

    public final static BigInteger NUMBER = new BigInteger("600851475143");

    public static void main(String[] args){
        System.out.println(Mathmatics.getPrimeNumbers(NUMBER));
        System.out.println(Various.getLargestInteger(Mathmatics.getPrimeNumbers(NUMBER)));
    }
}
