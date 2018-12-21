package com.stackroute;

import static org.junit.Assert.*;
import org.junit.Test;

public class EvenNumTest
{
//EvenNum en;

@Test

    public void checkEven1()
{
    assertEquals(true,isEven(4));
}

@Test

    public void checkEven2()
    {
        assertEquals(false,isEven(5));
    }


    @Test
    public void checkEven3()
    {
        assertEquals(false,isEven('j'));
    }

}

}