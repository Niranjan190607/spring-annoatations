package net.javathecode.spring_annotaations.controller;


import net.javathecode.spring_annotaations.service.Pizza;
import net.javathecode.spring_annotaations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class PizzaController {

    //@Autowired
   // @Qualifier("vegPizza")
    private Pizza pizza;
    //@Autowired
    public PizzaController(Pizza pizza){
        this.pizza = pizza;
    }

    /*@Autowired
    public void setVegPizza(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }*/

    public String getPizza(){
        return pizza.getPizza();
    }

    public void init(){
        System.out.println("Initialization Logic....");
    }
    public void destroy(){
        System.out.println("Destruction Logic....");
    }
}
