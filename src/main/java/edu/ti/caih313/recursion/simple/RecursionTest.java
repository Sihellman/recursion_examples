package edu.ti.caih313.recursion.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionTest {

    @Test
    public void testOdd() {
        assertEquals(1, OddDigits.CountOddDigits(-2009));
        assertEquals(3, OddDigits.IterateOdd(-2111));
    }
    @Test
    public void testSum(){
        Assertions.assertEquals(6, Sum.DigitSum(123));
        assertEquals(0, Sum.DigitSum(-98));
        assertEquals(6, Sum.IterateDigitSum(123));
        assertEquals(0, Sum.IterateDigitSum(-98));
    }
    @Test
    public void testTenToTheN(){
        Assertions.assertEquals(10000, TenToTheN.tenToTheN(4));
        assertEquals(1000, TenToTheN.tenToTheN(3));
        assertEquals(1000, TenToTheN.iterateTenToTheN(3));
        assertEquals(10000, TenToTheN.iterateTenToTheN(4));
    }
}