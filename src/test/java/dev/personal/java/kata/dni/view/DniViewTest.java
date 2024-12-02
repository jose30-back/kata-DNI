package dev.personal.java.kata.dni.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class DniViewTest {
    @Test
    void testGetInput() {
        InputStream originalSystemIn = System.in;

        try {
            String inputSimulado = "12345678";
            System.setIn(new ByteArrayInputStream(inputSimulado.getBytes()));

            DniView view = new DniView();
            int result = view.getInput();

            assertEquals(12345678, result);

        } finally {
            System.setIn(originalSystemIn);
        }
    }

    @Test
    void testPrintFullDni() {
        PrintStream originalSystemOut = System.out;

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            System.setOut(printStream);

            DniView view = new DniView();

            view.printFullDni("12345678Z");

            String expectedOutput = "El dni completo es: 12345678Z" + System.lineSeparator();
            assertEquals(expectedOutput, outputStream.toString());

        } finally {
            System.setOut(originalSystemOut);
        }
    }
}
