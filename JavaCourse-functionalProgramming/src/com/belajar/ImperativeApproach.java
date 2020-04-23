package com.belajar;

import java.util.ArrayList;
import java.util.List;

public class ImperativeApproach {

   public static void main(String[] args) {
       List<Person> people = List.of(
           new Person("rauf", Gender.MALE),
           new Person("adit",Gender.MALE),
           new Person("dandi",Gender.MALE),
           new Person("Ayatullah",Gender.FEMALE),
           new Person("Gusnur",Gender.MALE),
           new Person("Sam",Gender.MALE)
       );

       // imperative approach
       List<Person> females = new ArrayList<>();

       for(Person person : people){
           if(Gender.FEMALE.equals(person.gender)){
               females.add(person);
           }
       }

       for(Person femaless : females){
           System.out.println(femaless);
       }
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
