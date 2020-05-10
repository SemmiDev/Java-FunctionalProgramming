package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Sam", Gender.MALE,"sammi@gmail.com"),
                new Person("Ayatullah", Gender.BOTH,"ayatullah@gmail.com"),
                new Person("Otong", Gender.PREFER_NOT_T0_SAY,"otong@gmail.com"),
                new Person("Alice", Gender.FEMALE,"Alice@gmail.com")
        );

        // print length
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;
        private final String mail;

        public Person(String name, Gender gender, String mail) {
            this.name = name;
            this.gender = gender;
            this.mail = mail;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", mail='" + mail + '\'' +
                    '}';
        }
    }

    enum Gender{
        MALE,FEMALE,BOTH,PREFER_NOT_T0_SAY
    }
}
