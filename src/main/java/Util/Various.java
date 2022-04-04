package Util;

import java.util.Set;

public class Various {

    public static int sumInteger(Set<Integer> listOfNumbers){
        int result = 0;
        for (Integer number: listOfNumbers) {
            result += number;
        }
        return result;
    }
}
