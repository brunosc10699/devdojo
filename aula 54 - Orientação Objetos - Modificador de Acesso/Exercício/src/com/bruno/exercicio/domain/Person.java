package com.bruno.exercicio.domain;

public class Person {

    private String name;
    private Integer age;

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
        if (age <= 0) {
            System.out.println("A idade deve ser maior que 0 (zero)!");
            return;
        }
        this.age = age;
    }
}
