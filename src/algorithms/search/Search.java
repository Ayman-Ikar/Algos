package algorithms.search;

import java.util.function.Predicate;

public interface Search<T, G, F> {

    G search(T resource, Predicate<G> condition);
    F search(T resource, G target);
}
