package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Feeling> sortedList = generator.sortedRainbowFuzzies();
        ArrayList<Feeling> randomList = generator.randomizedRainbowFuzzies();

        int test1 = finder.linearSearch(sortedList, "gold");
        int test2 = finder.binarySearch(sortedList, "gold");
        int test3 = finder.linearSearch(randomList, "gold");
        int test4 = finder.binarySearch(randomList, "gold");

        int coldIndex = finder.findColdPrickly(randomList);

        System.out.println("Sorted (Linear) gold: " + test1);
        System.out.println("Sorted (Binary) gold: " + test2);
        System.out.println("Random (Linear) gold: " + test3);
        System.out.println("Random (Binary) gold: " + test4);
        System.out.println("Cold prickly index: " + coldIndex);
    }
}
