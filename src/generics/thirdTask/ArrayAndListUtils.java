package generics.thirdTask;

import java.util.List;

public class ArrayAndListUtils {

    public static <E> List swap(List<E> list, int firstIndex, int secondIndex) {

        if (firstIndex < list.size() && secondIndex < list.size()) {
            E tmp = list.get(firstIndex);
            list.set(firstIndex, list.get(secondIndex));
            list.set(secondIndex, tmp);
        }
        return list;
    }

    public static <E extends Comparable> E max(List<E> list, int start, int end) {

        if (start < list.size() && end < list.size()) {
            E max = list.get(start);
            for (int i = start + 1; i <= end; i++) {
                if (max.compareTo(list.get(i)) == -1) {
                    max = list.get(i);
                }
            }
            return max;
        }
        return null;
    }
}
