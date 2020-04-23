package com.belajar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeclrativeApproach {

   public static void main(String[] args) {
       List<Person> people = List.of(
               new Person("rauf", Gender.MALE),
               new Person("adit",Gender.FEMALE),
               new Person("dandi",Gender.MALE),
               new Person("Ayatullah",Gender.FEMALE),
               new Person("Gusnur",Gender.FEMALE),
               new Person("Sam",Gender.MALE)
       );


       // Declarative approach
       people.stream()
               .filter(person -> Gender.FEMALE.equals(person.gender))
               .collect(Collectors.toList())
               .forEach(System.out::println);

       people.stream()
               .filter(person -> Gender.MALE.equals(person.gender))
               .collect(Collectors.toList())
               .forEach(System.out::println);
   }

   static class Person{
       private final String name;
       private final Gender gender;

       @Override
       public String toString() {
           return "Person{" +
                   "name='" + name + '\'' +
                   ", gender=" + gender +
                   '}';
       }

       public Person(String name, Gender gender) {
           this.name = name;
           this.gender = gender;
       }
   }

   enum Gender{
       MALE, FEMALE
   }
}
