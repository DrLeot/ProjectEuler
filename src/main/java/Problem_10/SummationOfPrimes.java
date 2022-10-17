package Problem_10;

import Util.Prime;

public class SummationOfPrimes {

    private static final int LIMIT = 2000000;

    public static void main(String[] args){
        Prime prime = new Prime(0);
        prime.preCalculatePrimes(LIMIT);
        //System.out.println(prime.getPrimes());
        System.out.println(prime.getPrimes().stream().reduce(0, Integer::sum));
    }
}
