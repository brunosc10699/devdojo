package com.bruno.exercicio.domain;

import java.util.Objects;

public class Student {

    private long id;
    private String name;
    private int age;
    private char genre;

    public Student() {
    }

    public Student(long id, String name, int age, char genre) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "\nid: " + id +
                "\nname: " + name +
                "\nage: " + age +
                "\ngenre: " + genre;
    }
}
