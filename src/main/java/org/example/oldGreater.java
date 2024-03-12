package org.example;

public class OldGreater {
    public static int oldPerson(Person[] people) {
       int oldPerson = people[0].getAge();
       int i = 1;
        while(i < people.length){
            if(people[i].getAge() > oldPerson){
                oldPerson = people[i].getAge();
            }
            i++;
        }
        return oldPerson;
    }
}
