package dev.personal.java.kata.dni.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class DniTest {
    @Test
    void testCalculateLetter() {
        Dni dni = new Dni(45676587);
        char letter = dni.calculateLetter(); 
        assertThat(letter, is('J'));
    }

    @Test
    void testGetDni() {
        Dni dni = new Dni(45676587);
        assertThat(dni.getDni(), is(45676587));
    }

    @Test
    void testGetFullDni() {
        Dni dni = new Dni(45676587);
        String full = dni.getFullDni();
        assertThat(full, is("45676587J"));
    }
}
