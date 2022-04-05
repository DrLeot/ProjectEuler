package Problem_7;

import Util.Prime;

public class TenThousandAndFirstPrime {


    public static void main(String[] args) {
        Prime prime = new Prime(10001);
        System.out.println(prime.getPrimeByIndex(10001));
    }
}
