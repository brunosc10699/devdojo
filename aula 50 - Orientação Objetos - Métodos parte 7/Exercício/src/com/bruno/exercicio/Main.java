package com.bruno.exercicio;

import com.bruno.exercicio.domain.Student;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1L, "Bruno", 30, 'M');
        Student student2 = new Student(2L, "Oliveira", 20, 'M');

        System.out.println("\nEstudante 1 e Estudante 2 ANTES da chamada do método que muda o valor do parâmetro:");

        printStudents(student1, student2);

        student1.changeParameter(student1);
        student2.changeParameter(student2);

        System.out.println("\nEstudante 1 e Estudante 2 DEPOIS da chamada do método que muda o valor do parâmetro:");

        printStudents(student1, student2);

        System.out.println(
                "\nConclusão: o valor das variáveis do tipo 'referência' é alterado " +
                        "quando passado como parâmetro."
        );
    }

    private static void printStudents(Student student1, Student student2) {
        System.out.println(student1);
        System.out.println(student2);
    }
}
