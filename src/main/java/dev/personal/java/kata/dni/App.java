package dev.personal.java.kata.dni;

import dev.personal.java.kata.dni.controller.DniController;
import dev.personal.java.kata.dni.model.Dni;
import dev.personal.java.kata.dni.view.DniView;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Dni model = new Dni(0);
        DniView view = new DniView(); 
        DniController controller = new DniController(model, view); 

        controller.processDni();

    }
}
