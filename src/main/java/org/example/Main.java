package org.example;

import org.example.cars.Audi;
import org.example.cars.BMW;
import org.example.configs.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//создаем наш контейнер (при исп конфигурации JAva класса)
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Audi audi = context.getBean(Audi.class);
            audi.move();
            audi.getMagnitola().play();

        System.out.println("------------------------");
        BMW bmw = context.getBean(BMW.class);
        bmw.move();
        bmw.getMagnitola().play();
        System.out.println("test revert");
    }
}