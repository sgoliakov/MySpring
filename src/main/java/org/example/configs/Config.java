package org.example.configs;

import org.example.cars.Audi;
import org.example.cars.BMW;
import org.example.interfaces.Magnitola;
import org.example.magnitola.Sony;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

//создаем метод который будет возвращать объект интерфейса,
//в котором будем передавать реализацию, из которого будет сделан бин
    @Bean
   public Magnitola getSonyMagnitola(){
        return new Sony();
    }
//создаем бин машины(будет принимать в себя магнитолу)
//spring сам все подставит
    @Bean
    public Audi getAudi(Magnitola magnitola){
        return new Audi(magnitola);
    }

    @Bean
    public BMW getBMW(Magnitola magnitola){
        return new BMW(magnitola);
    }
}
