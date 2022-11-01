import algorithms.search.Search;
import algorithms.search.implementations.BinarySearch;

public class Algos {

    public static void main(String[] args) {

        Search<Integer[], Integer> binary = new BinarySearch();

        Integer[] sample = new Integer[] {1,2,3,5,7,9,45,102,200,325,455,500,2333};

        System.out.println("launching binary search");
        // normal check
        System.out.println(binary.search(sample, 325));
        // value does not exist
        System.out.println(binary.search(sample, 100));
        // the highest value
        System.out.println(binary.search(sample, 2333));
    }
}
