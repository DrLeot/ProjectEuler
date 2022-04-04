package Util;

import java.util.HashSet;
import java.util.Set;

public final class Math {

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
