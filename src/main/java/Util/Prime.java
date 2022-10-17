package Util;

import java.util.*;

public class Prime {

    private int currentIndex = 1;
    HashMap<Integer, Integer> primes = new HashMap<>();

    public Prime(int precalcIndex){
        preCalculateIndex(precalcIndex);
    }

    public ArrayList<Integer> getPrimes(){
        return new ArrayList<Integer>(primes.values());
    }

    public void preCalculateIndex(final int index){
        for(int i=1; i<Integer.MAX_VALUE; i++){
            if(Mathmatics.isPrime(i)){
                add(i);
            }
            if(currentIndex > index){
                return;
            }
        }
    }

    private void add(int number){
        primes.put(currentIndex,number);
        currentIndex++;

    }

    public void preCalculatePrimes(int number){
        for(int i=1; i<=number; i++){
            if(!primes.containsKey(i-1)){
                if(Mathmatics.isPrime(i)){
                    add(i);
                }
            }
        }
    }

    public int getByHighestIndex(){
        for (Map.Entry<Integer, Integer> entry : primes.entrySet()) {
            if (entry.getValue().equals(Collections.max(primes.values()))){
               return entry.getKey();
            }
        }
        return -1;
    }

    public int getPrimeByIndex(int index){
        if(primes.containsKey(index-1)){
            return primes.get(index);
        }
        preCalculatePrimes(index);

        return getPrimeByIndex(index);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Integer, Integer> prime : primes.entrySet()) {
            stringBuilder.append("["+prime.getKey()+","+prime.getValue()+"]");
            // ...
        }

        return stringBuilder.toString();
    }
}
