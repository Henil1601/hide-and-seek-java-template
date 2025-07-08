package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class FuzzyListGenerator {
    int iterations;

    public FuzzyListGenerator() {
        this.iterations = 1000;
    }

    public FuzzyListGenerator(int iterations) {
        this.iterations = iterations;
    }

    public ArrayList<Feeling> randomizedRainbowFuzzies() {
        ArrayList<Feeling> fuzzies = new ArrayList<>();
        for (int i = 0; i < this.iterations; i++) {
            fuzzies.add(new Fuzzy("red"));
            fuzzies.add(new Fuzzy("orange"));
            fuzzies.add(new Fuzzy("yellow"));
            fuzzies.add(new Fuzzy("green"));
            fuzzies.add(new Fuzzy("blue"));
            fuzzies.add(new Fuzzy("indigo"));
            fuzzies.add(new Fuzzy("violet"));
        }
        fuzzies.add(new Fuzzy("gold"));
        fuzzies.add(new Prickly());

        Collections.shuffle(fuzzies);
        return fuzzies;
    }

    public ArrayList<Feeling> sortedRainbowFuzzies() {
        ArrayList<Feeling> fuzzies = new ArrayList<>();
        for (int i = 0; i < this.iterations; i++) {
            fuzzies.add(new Fuzzy("red"));
            fuzzies.add(new Fuzzy("orange"));
            fuzzies.add(new Fuzzy("yellow"));
            fuzzies.add(new Fuzzy("green"));
            fuzzies.add(new Fuzzy("blue"));
            fuzzies.add(new Fuzzy("indigo"));
            fuzzies.add(new Fuzzy("violet"));
        }
        fuzzies.add(new Fuzzy("gold"));
        fuzzies.add(new Prickly());

        fuzzies.sort((f1, f2) -> f1.description().compareTo(f2.description()));
        return fuzzies;
    }
}
