package com.qa;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void blackJackTest(){
        app = new App();

        assertEquals(app.blackJack(10, 21), 21);
        assertEquals(app.blackJack(20, 18), 20);
        assertEquals(app.blackJack(1, 22), 1);
        assertEquals(app.blackJack(22, 23), 0);
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
