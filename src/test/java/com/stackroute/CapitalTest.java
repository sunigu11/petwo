package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;

public class CapitalTest {
    Capital capital=new Capital();

    @Test
    public void letterCheck()
    {
        assertEquals("small letters" , capital.letterCheck('t'));
        assertEquals("special letters", capital.letterCheck('@'));
    }
}
