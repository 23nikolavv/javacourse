package course.qa;

import course.qa.model.Person;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person(1L, "John", "Doe", 28),
                new Person(2L, "Marye", "Kumova", 30),
                new Person(3L, "Pablo", "Bar", 15),
        };

        int sum = 0;
        for (Person p : persons) {
            System.out.println(p);
            sum += p.getAge();
        }
        System.out.println((double)sum/ persons.length);

    }
}
// average= (


   /*  //   for (Person p : persons) {
            System.out.println(p);
        }
        for (int i=0; i< persons.length; i++){
            System.out.println(persons[i]);
        }
        int i=0;
        while(i< persons.length){
            System.out.println(persons[i]);
        }

    }
}
*/

