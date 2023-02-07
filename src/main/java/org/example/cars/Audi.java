package org.example.cars;

import org.example.interfaces.Car;
import org.example.interfaces.Magnitola;

public class Audi implements Car {
  private Magnitola magnitola;

    public Audi(Magnitola magnitola) {
        this.magnitola = magnitola;
    }

    @Override
    public void move() {
        System.out.println("audi move");
    }

    public Magnitola getMagnitola() {
        return magnitola;
    }

    public void setMagnitola(Magnitola magnitola) {
        this.magnitola = magnitola;
    }
}
