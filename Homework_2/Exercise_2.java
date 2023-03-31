// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package Homework_2;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Exercise_2 {
    public static void main(String[] args) {
        try {
            File myObj = new File("/Volumes/bam/Обучение/Java/Homework_2/test.txt");
            if (myObj.createNewFile()) {
                System.out.println("Файл создан: " + myObj.getName());
            } else {
                System.out.println("Такой файл уже есть.");
            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("/Volumes/bam/Обучение/Java/Homework_2/test.txt");
            for (int i = 0; i < 100; i++) {
                myWriter.write("TEST");
            }
            myWriter.close();
            System.out.println("Успешно записано в файл");
        } catch (IOException e) {
            System.out.println("Что-то пошло не так.");
            e.printStackTrace();
        }
    }
}