package com.stackroute;
import static org.junit.Assert.*;
import org.junit.Test;

public  class PalindromeTest
{
Palindrome pal=new Palindrome ();
    @Test
    public void checkPalindrome(int n)
    {
        assertTrue(expected:true,pal.checkPal(414) );

    }
    @Test
    public void checkPalindrome1(int n)
    {
        assertFalse(expected:false,pal.checkPal(123) );

    }
    @Test
    public void checkPalindrome2(String str)
    {
        assertTrue(expected:true,pal.checkPal("mom") );


    }
    @Test
    public void checkPalindrome3(String str)
    {
        assertFalse(expected:false,pal.checkPal("brother") );


    }
}


