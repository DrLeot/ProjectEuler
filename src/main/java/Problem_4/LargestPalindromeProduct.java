package Problem_4;

import Util.Mathmatics;

import java.util.HashSet;

public class LargestPalindromeProduct {

    private static HashSet<PalindromProduct> result = new HashSet<>();
    public static final int NUMBEROFDIGITS = 3;

    public static void main(String[] args) {
        for(int a = (int)Math.pow(10,NUMBEROFDIGITS-1); a < (int)Math.pow(10,NUMBEROFDIGITS); a++){
            for(int b = (int)Math.pow(10,NUMBEROFDIGITS-1); b < (int)Math.pow(10,NUMBEROFDIGITS); b++){
                if(Mathmatics.isNumberPalindrom(a*b)){
                    result.add(new PalindromProduct(a,b,a*b));
                }
            }
        }
        System.out.println(result.stream().max(PalindromProduct::compareTo).orElse(null));
    }
}
