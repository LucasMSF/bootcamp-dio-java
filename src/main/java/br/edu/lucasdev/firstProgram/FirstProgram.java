package br.edu.lucasdev.firstProgram;

import br.edu.lucasdev.firstProgram.model.People;

public class FirstProgram {
    // References
    // https://glysns.gitbook.io/java-basico/
    public static void main(String[] args) {
        /*System.out.println("First Program");*/
        People people = new People("Lucas", 20);
        System.out.println(people.toString());
    }
}
