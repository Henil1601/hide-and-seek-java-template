package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testLinearAndBinarySearch() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        var sorted = generator.sortedRainbowFuzzies();
        var random = generator.randomizedRainbowFuzzies();

        assertTrue(finder.linearSearch(sorted) >= 0);
        assertTrue(finder.linearSearch(random) >= 0);
        assertTrue(finder.binarySearch(sorted) >= 0);

        // This may fail or return -1 since binarySearch on random is not reliable
        System.out.println("Binary on random: " + finder.binarySearch(random));
    }
}
