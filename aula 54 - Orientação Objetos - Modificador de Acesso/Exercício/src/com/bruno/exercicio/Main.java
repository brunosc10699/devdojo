package com.bruno.exercicio;

import com.bruno.exercicio.domain.Person;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setName("Bruno");
        person1.setAge(0);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}
