package com.me.Lecture2.Exercise;

/**
 * Created by pramod on 5/15/2017.
 */
public class ElementUtils<T> {
    public static <T> T betterEntry(T s1, T s2, TwoElementPredicate predicate) {
        return predicate.betterOfTwo(s1, s2) ? s1 : s2;
    }
}
