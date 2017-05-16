package com.me.Lecture2.Exercise;

/**
 * Created by puneeth on 5/14/2017.
 */
public class SortUtils {
    public static int sortShortestFirst(String s1, String s2){
        return s1.length() == s2.length() ? 0 : s1.length() > s2.length() ? 1 : -1;
    }

    public static int sortLongestFirst(String s1, String s2){
        return s1.length() == s2.length() ? 0 : s1.length() > s2.length() ? -1 : 1;
    }

    public static int sortAphabeticallyFirstChar(String s1, String s2){
        return s1.charAt(0) == s2.charAt(0) ? 0 : s1.charAt(0) > s2.charAt(0) ? 1 : -1;
    }

    public static int sortContainsChare(String s1, String s2){
        return s1.toLowerCase().contains("e")?-1:1;
    }
}
