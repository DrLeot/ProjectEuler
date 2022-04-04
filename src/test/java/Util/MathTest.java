package Util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {


    @Test
    public void testMultiPliesOfThreeNegative(){
        assertEquals("[]",Math.multipliesOfThree(-10).toString());
    }

    @Test
    public void testMultiPliesOfThreeWithZero(){
        assertEquals("[]",Math.multipliesOfThree(0).toString());
    }
    @Test
    public void testMultiPliesOfFiveWithZero(){
        assertEquals("[]",Math.multipliesOfFive(0).toString());
    }
    @Test
    public void testMultiPliesOfFive(){
        assertEquals("[5]",Math.multipliesOfFive(10).toString());
    }
    @Test
    public void testMultiPliesOfThree(){
        assertEquals("[3, 6, 9]",Math.multipliesOfThree(10).toString());
    }

}