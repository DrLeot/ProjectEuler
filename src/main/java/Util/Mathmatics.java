package Util;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public final class Mathmatics {

    public static boolean isPrime(int number){
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static Set<BigInteger> getPrimeNumbers(BigInteger number){
        Set<BigInteger> ret = new HashSet<>();

        while (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
            ret.add(BigInteger.TWO);
            number = number.divide(BigInteger.TWO);
        }

        for(BigInteger i = new BigInteger("3"); i.compareTo(number.sqrt()) <= 0; i = i.add(BigInteger.TWO)){
            while (number.mod(i).equals(BigInteger.ZERO)){
                ret.add(i);
                number = number.divide(i);
            }
        }

        if(number.compareTo(BigInteger.TWO) >= 0){
            ret.add(number);
        }
        return ret;

    }

    public static boolean isNumberPalindrom( int number){
        int numberForward = number;
        int numberReversed = 0;
        int tmp;

        while(numberForward>0){
            tmp = numberForward%10;
            numberReversed = (numberReversed*10) + tmp;
            numberForward = numberForward/10;
        }

        return number == numberReversed;
    }

    public static Set<Integer> multipliesOfFive(final int number){
        return multipliesOf(5,number);
    }
    public static Set<Integer> multipliesOfThree(final int number){
        return multipliesOf(3,number);
    }


    private static Set<Integer> multipliesOf(final int n, final int number){
        Set<Integer> ret = new HashSet<>();

        if(n <= 0 || number <= 0){
            return ret;
        }

        int count = n;
        while(count < number){
            ret.add(count);
            count += n;
        }
        return ret;
    }
}
