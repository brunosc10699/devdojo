package com.bruno.exercicio.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Professor {

    private Long id;
    private String name;
    private Integer age;
    private Character genre;

    private final List<String> subjects = new ArrayList<>();

    public Professor() {
    }

    public Professor(Long id, String name, Integer age, Character genre) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.genre = genre;
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

    public Character getGenre() {
        return genre;
    }

    public void setGenre(Character genre) {
        this.genre = genre;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return id.equals(professor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "\nProfessor: " +
                "\nid: " + id +
                "\nnome: " + name +
                "\nidade: " + age +
                "\nsexo: " + genre +
                "\ndisciplinas: " + subjects;
    }
}
