package com.stackroute;

import org.junit.Before;

import static org.junit.Assert.*;

public class MemberTest {

    Member member = null;

    @Before
    public void setUp(){
        member = new Member("Harry Potter",30,2500.3);
    }

    public void testDisplay(){

        //act
        boolean expected = true;

        //arrange
        boolean result = member.display();

        //assert
        assertTrue(expected,result);
    }

}