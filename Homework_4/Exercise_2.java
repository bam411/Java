// 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Homework_4;

import java.util.LinkedList;
import java.util.List;

public class Exercise_2 {
    public static void main(String[] args) {
        LinkedList<String> array = new LinkedList<>(List.of("Первый", "Второй", "3", "4", "Пятый", "Шесть", "7"));
        System.out.println(array);
        reverse(array);
        System.out.println(array);
    }

    private static void reverse(LinkedList<String> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            array.add(i, array.getLast());
            array.removeLast();
        }
    }
}
