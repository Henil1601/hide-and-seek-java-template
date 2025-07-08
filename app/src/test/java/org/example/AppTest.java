package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class AppTest {
    @Test
    void testFindGoldAndCold() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Feeling> fuzzies = generator.randomizedRainbowFuzzies();
        assertTrue(finder.linearSearch(fuzzies, "gold") >= 0);
        assertTrue(finder.findColdPrickly(fuzzies) >= 0);
    }
}

