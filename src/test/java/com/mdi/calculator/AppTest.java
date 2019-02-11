package com.mdi.calculator;

import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.function.Exp;
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
    public void ExpSimple() {
    	assertTrue(new Exp().value(0)==1);
    	assertFalse(new Exp().value(1)==1);
    }
}
