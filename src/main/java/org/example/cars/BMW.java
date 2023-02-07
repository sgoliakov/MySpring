package org.example.cars;

import org.example.interfaces.Car;
import org.example.interfaces.Magnitola;

public class BMW implements Car {
   private Magnitola magnitola;

    public BMW(Magnitola magnitola) {
        this.magnitola = magnitola;
    }

    @Override
    public void move() {
        System.out.println("BMW move");
    }

    public Magnitola getMagnitola() {
        return magnitola;
    }

    public void setMagnitola(Magnitola magnitola) {
        this.magnitola = magnitola;
    }
}
