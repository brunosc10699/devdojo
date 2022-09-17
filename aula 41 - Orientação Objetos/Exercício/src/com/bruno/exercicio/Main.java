package com.bruno.exercicio;

import com.bruno.exercicio.domain.Professor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Professor professor1 = new Professor();
        professor1.setId(1L);
        professor1.setName("Oliveira");
        professor1.setAge(30);
        professor1.setGenre('M');

        Professor professor2 = new Professor(2L, "Bruno", 25, 'M');
        professor2.getSubjects().addAll(Arrays.asList("Matemática", "Física"));

        professor1.getSubjects().add("Biologia");

        System.out.println(professor1);
        System.out.println(professor2);

    }
}
