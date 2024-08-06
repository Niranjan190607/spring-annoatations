package net.javathecode.spring_annotaations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class VegPizza implements Pizza{
    @Override
    public  String getPizza(){
        return "Veg pizza";
    }
}
