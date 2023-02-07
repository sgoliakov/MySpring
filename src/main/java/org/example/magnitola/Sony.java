package org.example.magnitola;

import org.example.interfaces.Magnitola;

public class Sony implements Magnitola {
    @Override
    public void play() {
        System.out.println("Play Sony");
    }
}
