// Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.

package Homework_3;

import java.util.*;

public class Exercise_3 {

    public static int delete(int numbers[], int n) {
        int a = 0;

        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                numbers[a++] = numbers[i];
            }
        }

        numbers[a++] = numbers[n - 1];

        return a;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
        System.out.println(Arrays.toString(numbers));

        int n = numbers.length;

        int j = 0;

        j = delete(numbers, n);

        for (int i = 0; i < j; i++)
            System.out.print(numbers[i] + " ");
    }
}
