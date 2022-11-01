package algorithms.search;

import java.util.function.Predicate;

public interface Search<T, G> {

    G search(T resource, Predicate<G> condition);
    G search(T resource, G target);
}
