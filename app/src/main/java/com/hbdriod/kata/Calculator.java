package com.hbdriod.kata;

import java.util.StringTokenizer;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class Calculator {


    //Method who makes a sum of an input String value
    public int add(String string) {
        int sum = 0;
        if (string.equals("")) {
            return sum;
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(string,",\n");
            while (stringTokenizer.hasMoreTokens()) {
                String token = stringTokenizer.nextToken();
                sum = sum + Integer.parseInt(token.toString());
            }
            return sum;
        }
    }
}
