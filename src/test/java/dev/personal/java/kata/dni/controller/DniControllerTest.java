package dev.personal.java.kata.dni.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.personal.java.kata.dni.model.Dni;
import dev.personal.java.kata.dni.view.DniView;

public class DniControllerTest {

    private DniController dniController;
    private Dni mockDni;
    private DniView mockDniView;

    @BeforeEach 
    public void setUp (){

    mockDni = mock(Dni.class);
    mockDniView = mock(DniView.class);

    dniController = new DniController(mockDni, mockDniView);
    }

    @Test
    public void testProcessDni() {
        
        int inputDni = 12345678;
        String expectFullDni = "12345678Z";

        when(mockDniView.getInput()).thenReturn(inputDni);
        when(mockDni.getFullDni()).thenReturn(expectFullDni);

        dniController.processDni();

        verify(mockDniView).getInput();
        verify(mockDniView).printFullDni(expectFullDni);

        assertEquals(expectFullDni, mockDni.getFullDni());

    }
}
