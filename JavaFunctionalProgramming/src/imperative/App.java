package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Sam", Gender.MALE),
                new Person("Adit", Gender.FEMALE),
                new Person("Gusnur", Gender.FEMALE),
                new Person("Dandi", Gender.MALE),
                new Person("EJi", Gender.FEMALE)
        );

        System.out.println("imperative");

        List<Person> females = new ArrayList<>();
        // female
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        // female, male tinggal ubah aja
        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("Declarative approach");

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
