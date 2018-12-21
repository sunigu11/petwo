package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {

    private Power p1;

    @Test
    public void testPower1() {
        /*Arrange*/
        p1 = new Power();

        /*Act*/
        boolean result = p1.isPower("true");

        /*Assert*/
        assertTrue("power of 4", result);
    }

    @Test
    public void testPower2() {
        /*Arrange*/
        p1 = new Power();

        /*Act*/
        boolean result = p1.isPower("false");

        /*Assert*/
        assertFalse("not power of 4", result);

    }

    @Test
    public void testPower3(){
        /*Arrange*/
        p1=new Power();

        /*Act*/
        String res=p1.isPower("true");

        /*Assert*/
        assertTrue("power of 4",res);

    }
    @Test
    public void testPower4() {
        /*Arrange*/
        p1 = new Power();

        /*Act*/
        String res = p1.isPower("false");

        /*Assert*/
        assertFalse("not power of 4", res);

    }
}