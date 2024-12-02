package dev.personal.java.kata.dni.model;


public class Dni {

    private int dni;

    private final char[] characters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H',
            'L','C','K','E' 
    };

    public Dni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public char calculateLetter () {
        int modul = dni % 23;
        char letter = characters[modul];
        return letter;

    } 

    public String getFullDni (){
        return String.valueOf(dni) + calculateLetter();
    }
}
