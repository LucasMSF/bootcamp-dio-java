package br.edu.lucasdev.junit;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}
