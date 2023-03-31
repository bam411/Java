// Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

package Homework_3;

import java.util.stream.IntStream;
import java.util.*;

public class Exercise_1 {
    public static void main(String[] args) {
        int count = 0;
        int array[] = null;
        int[] numbers = IntStream.generate(() -> new Random().nextInt(10)).limit(5).toArray();
        System.out.println(Arrays.toString(numbers));

        for (int i : numbers) {
            if (!(i % 2 == 0))
                ++count;
        }

        array = new int[count];
        int i = 0;
        for (int num : numbers) {
            if (!(num % 2 == 0)) {
                array[i++] = num;
            }
        }

        System.out.println("Массив после удаления: ");
        System.out.println(Arrays.toString(array));
    }
}
