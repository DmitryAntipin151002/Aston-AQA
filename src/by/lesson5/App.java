package by.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] words = new String[] {"Cat", "Dog", "Bird", "Dog", "Chicken", "Bird", "Lizard", "Dog", "Lizard",
                "Chicken", "Chicken", "Cat", "Elephant"};

        ArrayList<String> collection = new ArrayList<>(Arrays.asList(words));
        ArrayFunctions.printUniqueValues(collection);
        System.out.println();
        ArrayFunctions.printCountOfValues(collection);
        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+3753291233232", "Ivanov");
        phoneBook.add("+375333568687", "Ivanov");
        phoneBook.add("+375331113322", "Medvedev");
        phoneBook.add("+375331231212", "Fominko");
        phoneBook.add("+3753293451221", "Ivanov");
        //Проерка на существующий номер телефона
        phoneBook.add("+3753293451221", "Stukov");

        System.out.println(phoneBook.get("Medvedev"));
        System.out.println(phoneBook.get("Ivanov"));
    }
}