package com.bruno.exercicio;

import com.bruno.exercicio.domain.Student;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1L, "Bruno", 25, 'M');

        Student student2 = new Student();
        student2.setId(2L);
        student2.setName("Oliveira");
        student2.setAge(30);
        student2.setGenre('M');

        System.out.println(student1);

        System.out.println(student2);
    }
}
