package net.javathecode.spring_annotaations.config;

import net.javathecode.spring_annotaations.controller.PizzaController;
import net.javathecode.spring_annotaations.service.NonVegPizza;
import net.javathecode.spring_annotaations.service.Pizza;
import net.javathecode.spring_annotaations.service.VegPizza;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza(){

        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(nonVegPizza());
    }
}
