package by.lesson5;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ArrayFunctions {
    public static void printUniqueValues(List<String> array) {
        Set<String> uniqueValues = Set.copyOf(array);
        System.out.println("Unique words: ");
        for (String word : uniqueValues) {
            System.out.print(word + " ");
        }
    }

    public static void printCountOfValues(List<String> array) {
        Set<String> uniqueValues = Set.copyOf(array);
        for (String word : uniqueValues) {
            System.out.println(word + " frequency: " + Collections.frequency(array, word));
        }
    }
}
