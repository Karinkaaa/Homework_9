package generics.secondTask;

import java.util.ArrayList;
import java.util.List;

public class AnyObjectStore {

    public static <E extends Number> void addElement(List<E> list, E element) {
        list.add(element);
    }

    public static <E extends Number> E removeElement(List<E> list, E element) {
        return list.remove(element) ? element : null;
    }

    public static <E extends Number> boolean contains(List<E> list, E element) {
        return list.contains(element);
    }
}
