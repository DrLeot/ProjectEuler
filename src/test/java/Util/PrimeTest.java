package Util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {


    @Test
    public void testPrimepreCalculdate(){
        Prime prime = new Prime(0);
        prime.preCalculatePrimes(10);
        assertEquals("[1,2][2,3][3,5][4,7]",prime.toString());
    }

    @Test
    public void testHighestEntry(){
        Prime prime = new Prime(0);
        prime.preCalculateIndex(100);
        assertEquals(100,prime.getByHighestIndex());
    }
}