package com.bruno.exercicio;

import com.bruno.exercicio.domain.Student;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student();

        System.out.println(student1);

        System.out.println(student2);

        student1.setId(1L);
        student1.setName("Oliveira");
        student1.setGenre('M');

        System.out.println(student1);

        System.out.println(student2);
    }
}
