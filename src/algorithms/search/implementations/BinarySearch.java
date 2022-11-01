package algorithms.search.implementations;

import algorithms.search.Search;

import java.util.Objects;
import java.util.function.Predicate;

public class BinarySearch implements Search<Integer[], Integer> {

    @Override
    public Integer search(Integer[] resource, Predicate<Integer> condition) {
        return null;
    }

    @Override
    public Integer search(Integer[] resource, Integer target) {
        int start = 0;
        int end = resource.length - 1;

        while(start <= end) {

            int mid = (end + start) / 2;
            int guess = resource[mid];

            if(Objects.equals(guess, target))
                return mid;
            else if(target < guess)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return null;
    }
}
