package com.hbdriod.kata;

import java.util.StringTokenizer;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class Calculator {


    //Method who makes a sum of an input String value
    public int add(String string) {
        if (string.equals("")) {
            return 0;
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(string,",");
            if (stringTokenizer.countTokens()==1){
                return Integer.parseInt(stringTokenizer.nextElement().toString());
            }else{
                return Integer.parseInt(stringTokenizer.nextElement().toString())+Integer.parseInt(stringTokenizer.nextElement().toString());


            }

        }


    }


}
