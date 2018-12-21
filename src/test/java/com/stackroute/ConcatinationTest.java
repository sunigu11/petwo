package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConcatinationTest {
    Concatination concatination=new Concatination();
    @Test
    public void display()
    {
        assertEquals("Stackroutetete",concatination.getString("Stackroute",2));
    }
    @Test
    public void check ()
    {
        assertEquals("Stackrouteuteuteute",concatination.getString("Stackroute",3));
    }
    @Test
    public void check ()
    {
        assertEquals("error",concatination.getString(5,3));

    }

}

