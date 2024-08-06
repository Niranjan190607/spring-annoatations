package net.javathecode.spring_annotaations.propertysource;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:mail.properties")
//@PropertySource("classpath:message.properties")
@PropertySources({
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:message.properties")}
)
public class SpringConfig {
}
