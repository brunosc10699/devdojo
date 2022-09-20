package com.bruno.exercicio;

import com.bruno.exercicio.domain.Student;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1L, "Bruno", 30, 'M');
        Student student2 = new Student(2L, "Oliveira", 20, 'M');

        System.out.println(student1);
        System.out.println(student2);
    }
}
