package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;
public class OriginalTester {
    Original original = new Original();

    @Test
    public void numberChecker() {
        assertEquals("number guessed less the original number", original.numberChecker(3));
    }

    @Test
    public void numberChecker1() {
        assertEquals("number guessed matches the original number", original.numberChecker(31));
    }

    @Test
    public void numberChecker2() {
        assertEquals("number guessed greater the original number", original.numberChecker(100));
    }
}