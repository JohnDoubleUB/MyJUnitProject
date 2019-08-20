package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(args[0]);
        System.out.println( "Hello World!" );



    }

    public int blackJack(int x, int y) {

        //This could be the first if in an else if, but I think it looks nicer this way
        // Given 2 integer values greater than 0
        if(x > 0 && y > 0) {

            // if both go over 21 return 0
            if (x > 21 && y > 21) {
                return 0;
            } else if (x > 21) { // if x is over 21 return y
                return y;
            } else if (y > 21) { // if y is over 21 return x
                return x;
            } else if ((21 - x) < (21 - y)) { // if x is closer than y
                return x;
            } else {
                return y;
            }

        } else {

            return 0;
        }
    }
}
