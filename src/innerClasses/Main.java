package innerClasses;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        /* Взять класс DataStructure, создать в этом классе private inner class EvenIterator,
         * который реализует DataStructureIterator (итератор должен последовательно возвращать
         * элементы массива arrayOfInts. Создать в классе DataStructure метод для возврата
         * объекта EvenIterator. */

        DataStructure dataStructure = new DataStructure();
        Iterator itr = dataStructure.getEvenIterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
    }
}
