package generics.firstTask;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Создать generic класс AnyObjectStore <T> (внутри значения хранить в одной из имплементаций Set):
         * - реализовать методы добавления объекта типа T;
         * - реализовать метод удаления объекта типа T;
         * - реализовать в этом классе метод contains() с параметром типа T. */

        AnyObjectStore<String> store = new AnyObjectStore<>();
        store.add("ab");
        store.add("cd");
        store.add("ef");
        store.add("gh");
        showStore(store);

        String value = getStringValue("\nEnter the deleted value: ");
        if (store.remove(value)) {
            System.out.println("Value " + value + " deleted successfully!");
        } else {
            System.out.println("Value " + value + " is not exist!");
        }

        showStore(store);

        value = getStringValue("\nEnter the sought value: ");
        if (store.contains(value)) {
            System.out.println("Value " + value + " is exists!");
        } else {
            System.out.println("Value " + value + " is not found!");
        }

    }

    private static void showStore(AnyObjectStore store) {

        Iterator itr = store.getSet().iterator();
        System.out.println("\nSet:");
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
    }

    private static String getStringValue(String message) {

        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String value = in.nextLine();
        return value;
    }
}
