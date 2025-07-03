package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

    // Linear Search
    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if (fuzzies.get(i).color.equals("gold")) {
                return i;
            }
        }
        return -1; // not found
    }

    // Binary Search
    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int low = 0;
        int high = fuzzies.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midColor = fuzzies.get(mid).color;

            int comparison = midColor.compareTo("gold");

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // not found
    }
}
