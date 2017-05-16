package com.me.Lecture2.Exercise;

/**
 * Created by puneeth on 5/15/2017.
 */
public class StringUtils {
    public static String betterString(String s1, String s2, TwoStringPredicate stringPredicate){
        return stringPredicate.betterStringOfTwo(s1,s2)?s1:s2;
    }
}
