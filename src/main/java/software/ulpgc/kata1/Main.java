package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Person person = new Person("Paco", LocalDate.of(1999,10,9));
        System.out.println(person.name() + " tiene " + person.age() + " años ");
    }
}
