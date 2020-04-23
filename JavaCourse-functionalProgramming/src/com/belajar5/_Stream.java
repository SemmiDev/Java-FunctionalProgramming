package com.belajar5;


import java.util.List;
import java.util.stream.Collectors;

import static com.belajar5._Stream.Gender.MALE;
import static com.belajar5._Stream.Gender.PREFER_NOT_TO_SAY;

public class _Stream {
   public static void main(String[] args) {

       List<Person> people = List.of(
           new Person("rauf", MALE),
           new Person("adit", MALE),
           new Person("dandi", MALE),
           new Person("Ayatullah",Gender.FEMALE),
           new Person("Gusnur", MALE),
           new Person("Sam", MALE),
           1new Person("Aryan",PREFER_NOT_TO_SAY)
       );

           // show value
       people.stream()
               .map(person -> person.gender)
               .collect(Collectors.toSet())
               .forEach(System.out::println);

           // menampilkan length setiap nama
       people.stream()
               .map(person -> person.name)
               .mapToInt(String::length)
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
       MALE, FEMALE, PREFER_NOT_TO_SAY
   }
}
