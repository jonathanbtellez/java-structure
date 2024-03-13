package org.example;

public class Main02 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("John", 15),
                new Person("Juan", 19),
                new Person("Martha", 26),
                new Person("Lizeth", 13),
                new Person("Luffy", 16),
                new Person("Zoro", 24),
                new Person("Robin", 26),
                new Person("Nami", 19),
        };

        System.out.println("The greater age is "+OldGreater.oldPerson(people));
        System.out.println("The data in the array is");

        for (Person person : people){
            System.out.println(person.toString());
        }
    }
}