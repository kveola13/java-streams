package main.java;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();
    }
    private static List<Person> getPeople(){
        return List.of(
                new Person("Warwick", 12, Gender.MALE),
                new Person("Lux", 21, Gender.FEMALE),
                new Person("Kennen", 10, Gender.MALE),
                new Person("Miss Fortune", 5, Gender.FEMALE),
                new Person("Zac", 23, Gender.MALE)
        );
    }
}
