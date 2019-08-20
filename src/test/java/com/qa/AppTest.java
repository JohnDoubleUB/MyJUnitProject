package com.qa;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @Test
    // Tests always neetd to be public, tests should always be void
    public void mainTest(){
        app = new App();
        String[] input = new String[]{"a"};
        app.main( input);
    }


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
