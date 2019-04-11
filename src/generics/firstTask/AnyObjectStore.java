package generics.firstTask;

import java.util.HashSet;
import java.util.Set;

public class AnyObjectStore<T> {

    private Set<T> set;

    public AnyObjectStore() {
        this.set = new HashSet<>();
    }

    public Set<T> getSet() {
        return set;
    }

    public boolean add(T element) {
        return set.add(element);
    }

    public boolean remove(T element) {
        return set.remove(element);
    }

    public boolean contains(T element) {
        return set.contains(element);
    }
}
