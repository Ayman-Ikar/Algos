package algorithms.search.implementations;

import algorithms.search.Search;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class StringBinarySearch implements Search<Collection<String>, String, Integer> {

    @Override
    public String search(Collection<String> resource, Predicate<String> condition) {
        return null;
    }

    @Override
    public Integer search(Collection<String> resource, String target) {
        int start = 0;
        int end = resource.size() - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            String guess = ((List<String>)resource).get(mid);

            if(guess.compareTo(target) == 0)
                return mid;
            else if(guess.compareTo(target) < 0)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return null;
    }
}
