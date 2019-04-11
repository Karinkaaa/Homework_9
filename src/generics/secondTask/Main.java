package generics.secondTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Создать не generic класс AnyObjectStore:
         *
         * a) реализовать статический generic метод добавления объекта в лист:
         *   параметры: List в который нужно добавить элемент, элемент который нужно добавить в лист;
         *   результат: void.
         *
         * b) реализовать статический generic метод удаления объекта из List:
         *   параметры: List из которого надо удалить елемент, элемент который нужно удалить;
         *   результат: вернуть удаленный объект или null если такого объекта нет в листе.
         *
         * c) реализовать в этом классе статический generic метод contains:
         *   параметры: List в котором надо проверить наличие элемена, элемент наличие которого нужно проверить;
         *   результат: TRUE/FALSE.
         *
         * !!!все методы класса AnyObjectStore должны работать только с классами обертками для чисел. */

        List<Integer> list = new ArrayList<>();
        fillingRandomValues(list, 10);
        showList(list);

        Integer value = getIntegerValue("\nEnter the deleted value: ");
        if (AnyObjectStore.removeElement(list, value) != null) {
            System.out.println("Value " + value + " deleted successfully!");
        } else {
            System.out.println("Value " + value + " is not exist!");
        }

        showList(list);

        value = getIntegerValue("\nEnter the sought value: ");
        if (AnyObjectStore.contains(list, value)) {
            System.out.println("Value " + value + " is exists!");
        } else {
            System.out.println("Value " + value + " is not found!");
        }
    }

    private static <E> void showList(List<E> list) {

        System.out.println("\nList:");
        for (E element : list) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    private static void fillingRandomValues(List list, int count) {

        Random random = new Random();
        for (int i = 0; i < count; i++) {
            AnyObjectStore.addElement(list, random.nextInt(20));
        }
    }

    private static Integer getIntegerValue(String message) {

        Scanner in = new Scanner(System.in);
        System.out.print(message);
        Integer value = in.nextInt();
        return value;
    }
}
