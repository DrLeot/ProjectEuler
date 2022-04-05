package Util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathmaticsTest {


    @Test
    public void testMultiPliesOfThreeNegative(){
        assertEquals("[]", Mathmatics.multipliesOfThree(-10).toString());
    }

    @Test
    public void testMultiPliesOfThreeWithZero(){
        assertEquals("[]", Mathmatics.multipliesOfThree(0).toString());
    }
    @Test
    public void testMultiPliesOfFiveWithZero(){
        assertEquals("[]", Mathmatics.multipliesOfFive(0).toString());
    }
    @Test
    public void testMultiPliesOfFive(){
        assertEquals("[5]", Mathmatics.multipliesOfFive(10).toString());
    }
    @Test
    public void testMultiPliesOfThree(){
        assertEquals("[3, 6, 9]", Mathmatics.multipliesOfThree(10).toString());
    }

}