// 1. Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

package Homework_4;

import java.util.Scanner;
import java.util.Stack;

public class Exercise_1 {
    public static void main(String[] args) {
        String message;
        try (Scanner text = new Scanner(System.in)) {
            Stack<String> stack = new Stack<>();
            do {
                message = text.next();
                if (!message.equals("print") && !message.equals("revert") && !message.equals("quit")) {
                    stack.push(message);
                } else if (message.equals("print")) {
                    for (int i = stack.size() - 1; i >= 0; i--) {
                        System.out.println(stack.elementAt(i));
                    }
                } else if (message.equals("revert")) {
                    stack.pop();
                }
            } while (!message.equals("quit"));
            System.out.println(stack);
        }
    }
}