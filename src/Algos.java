import algorithms.search.Search;
import algorithms.search.implementations.NumberBinarySearch;
import algorithms.search.implementations.StringBinarySearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Algos {

    public static void main(String[] args) {

        System.out.println("*************************************");
        System.out.println("Binary search with an integer");
        System.out.println("*************************************");

        Search<Integer[], Integer, Integer> binary = new NumberBinarySearch();

        Integer[] sample = new Integer[] {1,2,3,5,7,9,45,102,200,325,455,500,2333};


        // normal check
        System.out.println(binary.search(sample, 325));
        // value does not exist
        System.out.println(binary.search(sample, 100));
        // the highest value
        System.out.println(binary.search(sample, 2333));

        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("*************************************");
        System.out.println("Binary search with a string");
        System.out.println("*************************************");

        Search<Collection<String>, String, Integer> stringBinarySearch = new StringBinarySearch();

        List<String> sampleList = Arrays.asList("aaa", "aab", "aba", "abb", "bbb", "ccc", "ddd", "eeeee", "rrrrr", "www", "zzzzz");

        // normal check
        System.out.println(stringBinarySearch.search(sampleList, "aaa"));
        // value does not exist
        System.out.println(stringBinarySearch.search(sampleList, "eeeee"));
        // the highest value
        System.out.println(stringBinarySearch.search(sampleList, "zzzzz"));
    }
}
