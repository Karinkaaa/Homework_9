package generics.thirdTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Создайте класс ArrayAndListUtils:
         * a) реализовать в нем статический generic метод для смены местами элементов N и M:
         *    параметры метода: исходный массив, индекс элемента N, индекс элемента M;
         *    результат: массив, где элемент N и M поменяны местами.
         * b) реализовать статический generic метод для поиска в List максимального елемента начиная
         *    с позиции N и заканчивая позицией M:
         *    !!! сделать чтобы generic тип реализовывал Comparable
         *    параметры метода: исходный лист, индекс элемента N, индекс элемента M;
         *    результат: максимальный объект. */

        List<Integer> list = new ArrayList<>();
        fillingRandomValues(list, 10);
        showList(list);

        System.out.println("\nSWAP ELEMENTS:");
        int firstIndex = getIntValue("\nEnter the first index: ");
        int secondIndex = getIntValue("\nEnter the second index: ");

        list = ArrayAndListUtils.swap(list, firstIndex, secondIndex);
        showList(list);

        System.out.println("\n\nFIND THE MAX VALUE FROM BOUNDS:");
        int start = getIntValue("\nEnter the start index: ");
        int end = getIntValue("\nEnter the end index: ");

        System.out.println("\nMax value = " + ArrayAndListUtils.max(list, start, end));
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
            list.add(random.nextInt(25));
        }
    }

    private static int getIntValue(String message) {

        Scanner in = new Scanner(System.in);
        System.out.print(message);
        int value = in.nextInt();
        return value;
    }
}
