package net.javathecode.spring_annotaations.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {

    public EagerLoader(){
        System.out.println("EagerLoader...");
    }
}
