package com.qa;

import java.util.HashMap;

public class AppAdditonals {


    public static void main(String[] args){
        //AppAdditonals test = new AppAdditonals();

        //System.out.println(test.sortDesc(73065));

    }

    //sortDesc(123) -> 321
    //sortDesc(1254859723) -> 9875543221
    //sortDesc(73065) -> 76530

    public long sortDesc(int number){

        String result = "";

        if(number <= 0){
            return number;
        }

        // Make a hashmap of string to integer conversion
        HashMap<String, Integer> stringToInt = new HashMap<String, Integer>()
        {{
            put("0", 0);
            put("1", 1);
            put("2", 2);
            put("3", 3);
            put("4", 4);
            put("5", 5);
            put("6", 6);
            put("7", 7);
            put("8", 8);
            put("9", 9);
        }};

        // Convert input to a string
        String numbersString = Integer.toString(number);

        // Make an string list the length of the string
        String[] numberStringList = new String[numbersString.length()];

        // Add all the values to the list in the current order
        for(int i = 0; i < numbersString.length(); i++){
            numberStringList[i] = numbersString.substring(i, i+1);
        }

        // Sort all values using a bubble sort
        for(int j = 0; j < numberStringList.length; j++){
            for(int x = 0; x < numberStringList.length-1; x++){
                // Store next value
                String nextValueS = numberStringList[x+1];

                // Store integer values!
                int nextValue = stringToInt.get(nextValueS);
                int currentValue = stringToInt.get(numberStringList[x]);

                //Check if the current value is greater than the next one
                if(currentValue > nextValue){

                    // If it is, then switch these values around
                    numberStringList[x+1] = numberStringList[x];
                    numberStringList[x] = nextValueS;

                }

            }
        }

        // Now values are sorted, add them in turn to one string!

        for(int s = 0; s < numberStringList.length; s++){
            result = numberStringList[s] + result;
        }

        //Some of these values are too high after re-arranging and must be returned as long data type
        return Long.parseLong(result);
    }

}
