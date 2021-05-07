package test;

import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test for Improper brackets
    @Test
    public void incorrectBracketFail() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[TEST["));

    }
    @Test
    public void oneOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));

    }
    @Test
    public void oneClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));

    }
    @Test
    public void incorrectOrderOfBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }
    @Test
    public void testTenNestedPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[[[[[]]]]]]]]]]"));

    }
    @Test
    public void TenUnorderedPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][[[[]][]]]]"));

    }
    @Test
    public void testForEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));

    }
    @Test
    public void testForEmptyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));

    }
    @Test
    public void testForBouncingBackPastZero() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]["));

    }


}
