package com.me.Lecture2.Exercise;

import java.util.Arrays;

/**
 * Created by puneeth on 5/14/2017.
 */
public class MainAppPart1 {

    public static void main(String[] args) {
        String[] inputs = {"sandeep", "sarath", "navneeth", "manish", "puneeth", "ravi", "ratnakar"};
        System.out.println(Arrays.asList(inputs));
        //Sort Shortest String to Longest String
        Arrays.sort(inputs, (s1, s2) -> s1.length() == s2.length() ? 0 : s1.length() > s2.length() ? 1 : -1);
        System.out.println(Arrays.asList(inputs));
        Arrays.sort(inputs, (s1, s2) -> SortUtils.sortShortestFirst(s1, s2));
        System.out.println(Arrays.asList(inputs));
        //Sort Longest String to Shortest String
        Arrays.sort(inputs, (s1, s2) -> s1.length() == s2.length() ? 0 : s1.length() > s2.length() ? -1 : 1);
        System.out.println(Arrays.asList(inputs));
        Arrays.sort(inputs, (s1, s2) -> SortUtils.sortLongestFirst(s1, s2));
        System.out.println(Arrays.asList(inputs));
        //Sort Aphabetically by first char only
        Arrays.sort(inputs, (s1, s2) -> s1.charAt(0) == s2.charAt(0) ? 0 : s1.charAt(0) > s2.charAt(0) ? 1 : -1);
        System.out.println(Arrays.asList(inputs));
        Arrays.sort(inputs, (s1, s2) -> SortUtils.sortAphabeticallyFirstChar(s1, s2));
        System.out.println(Arrays.asList(inputs));
        //Sort contains character 'e'
        Arrays.sort(inputs, (s1, s2) -> s1.toLowerCase().contains("e") ? -1 : 1);
        System.out.println(Arrays.asList(inputs));
        Arrays.sort(inputs, (s1, s2) -> SortUtils.sortContainsChare(s1, s2));
        System.out.println(Arrays.asList(inputs));

        //Custom Interface
        String longer = StringUtils.betterString("1234", "asdfgh", (s1, s2) -> s1.length() > s2.length());
        System.out.println("Longer String: " + longer);
        String first = StringUtils.betterString("2454676", "asdfosadfsdf", (s1, s2) -> true);
        System.out.println("First String: " + first);

        //Custom Interface
        String longer1 = ElementUtils.betterEntry("1234", "asdfgh", (s1, s2) -> ((String) s1).length() > ((String) s2).length());
        System.out.println("Longer String: " + longer1);
        String first1 = ElementUtils.betterEntry("2454676", "asdfosadfsdf", (s1, s2) -> true);
        System.out.println("First String: " + first1);
        Car car1 = new Car();
        car1.setPrice(10);
        Car car2 = new Car();
        car2.setPrice(20);
        Car car = ElementUtils.betterEntry(car1, car2, (c1, c2) -> ((Car) c1).getPrice() > ((Car) c2).getPrice());
        System.out.print("Car Price: " + car.getPrice());
    }


}
