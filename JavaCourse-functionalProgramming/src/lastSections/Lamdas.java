package lastSections;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lamdas {
    public static void main(String[] args) {

        Integer number = null; // object
        int counter = 0; // primitve

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            // logic
            if (name.isBlank()) throw new IllegalArgumentException((""));
            System.out.println(age);
            return name.toUpperCase();
        };

       String uppercasename = upperCaseName.apply("sam", 12);
        System.out.println(uppercasename);
    }
}

