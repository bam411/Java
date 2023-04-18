// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков (ArrayList).
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
// Выводить только те ноутбуки, что соответствуют условию

package Homework_6;

import java.util.List;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Notebook LenovoAH401 = new Notebook("Lenovo", "AH-401", "Black", 15.6, 8, 256, "SSD");
        Notebook SamsungS101 = new Notebook("Samsung", "S-101", "Black", 15.6, 8, 512, "HDD");
        Notebook SamsungS150 = new Notebook("Samsung", "S-150", "Green", 17.0, 16, 512, "SSD");
        Notebook AsusTUF504 = new Notebook("ASUS", "TUF-504", "Red", 15.6, 32, 2048, "HDD 2.0");
        Notebook AsusTUF555 = new Notebook("ASUS", "TUF-555", "White", 15.6, 16, 1024, "SSD");

        List<Notebook> notebookList = List.of(LenovoAH401, SamsungS101, SamsungS150, AsusTUF504, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Искать \n1 - по цвету\n2 - по бренду");
        int userSearch = scannerUser.nextInt();
        try (Scanner scannerRequestUserForSearch = new Scanner(System.in)) {
            System.out.println("Введите цвет или бренд: ");
            String requestUserForSearch = scannerRequestUserForSearch.nextLine();

            if (userSearch == 1) {
                for (Notebook color : notebookList) {
                    if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(color.printInfo());
                    }
                }

            } else if (userSearch == 2) {
                for (Notebook brand : notebookList) {
                    if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(brand.printInfo());
                    }
                }
            } else {
                System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
            }
        }
        scannerUser.close();
    }
}
