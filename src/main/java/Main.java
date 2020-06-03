package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(System.out::println);
        List<Person> femaleStream = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        femaleStream.forEach(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Warwick", 12, Gender.MALE),
                new Person("Lux", 21, Gender.FEMALE),
                new Person("Kennen", 10, Gender.MALE),
                new Person("Miss Fortune", 5, Gender.FEMALE),
                new Person("Zac", 23, Gender.MALE),
                new Person("Anivia", 100, Gender.FEMALE)
        );
    }
}
