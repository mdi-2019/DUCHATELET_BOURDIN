package com.mdi.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void standardAddition()
    {
        assertTrue(1+2==3);
    }
    @Test
    public void standardSoustraction()
    {
        assertTrue(1-1==0);
    }
}
