package by.lesson5;

import java.util.Map;
import java.util.HashMap;

public class PhoneBook {
    private Map<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String phoneNumber, String lastName) {
        if(!phoneBook.containsKey(phoneNumber)) {
            phoneBook.put(phoneNumber, lastName);
        }
        else {
            System.out.println("This phone number already exists in this book!");
        }
    }

    public String get(String lastName) {
        String output = lastName + " numbers: ";
        for (var entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                output += entry.getKey() + " ";
            }
        }
        return output;
    }
}
