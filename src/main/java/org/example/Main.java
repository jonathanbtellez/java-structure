package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("John", 15),
                new Person("Juan", 19),
                new Person("Martha", 26),
                new Person("Lizeth", 13),
                new Person("Luffy", 16),
        };

        System.out.println(OldGreater.oldPerson(people));
    }
}