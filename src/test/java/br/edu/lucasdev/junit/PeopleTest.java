package br.edu.lucasdev.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeopleTest {
    @Test
    public void isAdulutTest() {
        People people = new People("Lucas", 20);
        Assertions.assertTrue(people.isAdult());
    }
}
