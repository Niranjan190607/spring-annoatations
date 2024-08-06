package net.javathecode.spring_annotaations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("Default name")
    private String defaultName;

    @Value("${java.home}")
    private String javaHome;

    public String getJavaHome() {
        return javaHome;
    }


    public String getDefaultName(){
        return defaultName;
    }
}
