package com.bruno.exercicio.domain;

import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.Random;

public class Student {

    private final Random random = new Random();

    private Long id;
    private String name;
    private Integer age;
    private Character gender;

    public Student() throws NoSuchAlgorithmException {
    }

    public Student(Long id, String name, Integer age, Character gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "\nEstudante " + id +
                "\nnome: " + name +
                "\nidade: " + age +
                "\nsexo: " + gender;
    }

    public void changeParameter(Student student) {
        student.setAge(random.nextInt(101));
        System.out.println("\nEstudante " + student.getId() + " DENTRO do método que muda o valor dos parâmetros:");
        System.out.println(student);
    }
}
