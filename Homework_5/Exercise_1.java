// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package Homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise_1 {
    public static void main(String[] args) {
        phoneBook();
    }

    private static void phoneBook() {
        Directory entry = new Directory();

        entry.add("1", "Гудков", "+7(979)906-18-37");
        entry.add("2", "Усенко", "+7(978)723-28-34");
        entry.add("3", "Смотрова", "+7(945)608-27-70");
        entry.add("4", "Бокарёва", "+7(937)211-37-19");
        entry.add("5", "Северов", "+7(990)986-97-85");
        entry.add("3", "Смотрова", "+7(905)706-27-85");
        entry.add("2", "Усенко", "+7(966)950-47-62");
        entry.add("1", "Гудков", "+7(923)477-49-71");

        System.out.println(entry.get("1"));
        System.out.println(entry.get("2"));
        System.out.println(entry.get("3"));
        System.out.println(entry.get("4"));
        System.out.println(entry.get("5"));
    }
}

class Directory {
    private Map<String, List<String>> directory = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String id, String surname, String phoneNumber) {
        if (directory.containsKey(id)) {
            phoneNumberList = directory.get(id);
            phoneNumberList.add(phoneNumber);
            directory.put(id, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(surname);
            phoneNumberList.add(phoneNumber);

            directory.put(id, phoneNumberList);
        }
    }

    public List<String> get(String id) {
        return directory.get(id);
    }

}
