package innerClasses.firstTask;

import java.util.NoSuchElementException;

public class DataStructure {

    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // заполнение массива числами от 0 до 15
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public EvenIterator getEvenIterator() {
        return new EvenIterator();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    private class EvenIterator implements DataStructureIterator {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < SIZE;
        }

        @Override
        public Integer next() {

            if (currentIndex < SIZE) {
                return arrayOfInts[currentIndex++];
            } else {
                throw new NoSuchElementException("No such element!");
            }
        }
    }
}
