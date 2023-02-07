package org.example.magnitola;

import org.example.interfaces.Magnitola;

public class Piyoner implements Magnitola {
    @Override
    public void play() {
        System.out.println("play Piyoner");
    }
}
