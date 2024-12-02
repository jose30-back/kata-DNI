package dev.personal.java.kata.dni.view;

import java.util.Scanner;

public class DniView {

    Scanner scanner = new Scanner(System.in);
    
    public int getInput () {

        while (true) {
            System.out.println("Ingrese un numero entre 0 y 99999999:");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("No es un numero entero. ingrese nuevamente el numero: ");
                scanner.next();
            }
        }
    }

    public void printFullDni (String getFullDni) {
        System.out.println("El dni completo es: " + getFullDni);
    }
}
