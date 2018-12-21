package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    //Palindrome pal=new Palindrome ();
    @Test
    public void checkPalindrome()
    {
        assertEquals(true, Palindrome.checkPal("414"));

    }
    @Test
    public void checkPalindrome1()
    {
        assertEquals(false, Palindrome.checkPal("123"));

    }
    @Test
    public void checkPalindrome2()
    {
        assertEquals(true, Palindrome.checkPal("mom"));


    }
    @Test
    public void checkPalindrome3()
    {
        assertEquals(false, Palindrome.checkPal("brother"));


    }

}