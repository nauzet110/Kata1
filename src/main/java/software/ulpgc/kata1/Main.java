package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Person person = new Person("Nauzet", LocalDate.of(2003, 11, 5));
        System.out.println(person.name() + " tiene " + person.age() + " años ");
    }
}
