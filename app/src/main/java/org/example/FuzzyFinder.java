package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

    public int linearSearch(ArrayList<Feeling> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).description().equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(ArrayList<Feeling> list, String target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            String current = list.get(mid).description();

            int comparison = current.compareTo(target);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int findColdPrickly(ArrayList<Feeling> list) {
        return linearSearch(list, "Pokey!");
    }
}
