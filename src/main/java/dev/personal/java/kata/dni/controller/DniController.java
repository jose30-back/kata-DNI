package dev.personal.java.kata.dni.controller;

import dev.personal.java.kata.dni.model.Dni;
import dev.personal.java.kata.dni.view.DniView;

public class DniController {

    Dni model;
    DniView view;

    public DniController(Dni model, DniView view) {
        this.model = model;
        this.view = view;
    }

    public void processDni (){
        int numberDni = view.getInput();
        model = new Dni(numberDni);
        String FullDni = model.getFullDni();
        view.printFullDni(FullDni);
    }
}
