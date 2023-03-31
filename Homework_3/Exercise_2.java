// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package Homework_3;

import java.util.stream.IntStream;
import java.util.*;

public class Exercise_2 {
    public static void main(String[] args) {
        int[] numbers = IntStream.generate(() -> new Random().nextInt(100)).limit(10).toArray();
        System.out.println(Arrays.toString(numbers));

        System.out.println("Минимальное значение: " + Arrays.stream(numbers).boxed().min(Integer::compare).get());

        System.out.println("Максимальное значение: " + Arrays.stream(numbers).boxed().max(Integer::compare).get());

        int length = numbers.length;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / length;

        System.out.println("Среднее значение : " + average);
    }
}