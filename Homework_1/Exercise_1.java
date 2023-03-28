// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

package Homework_1;

import java.util.Arrays;

public class Exercise_1 {
    public static void main(String[] args) {
        int[] A = { 6, 8, 3, 5, 1, 9 };

        int max = Arrays.stream(A)
                .max()
                .getAsInt();

        int min = Arrays.stream(A)
                .min()
                .getAsInt();

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}