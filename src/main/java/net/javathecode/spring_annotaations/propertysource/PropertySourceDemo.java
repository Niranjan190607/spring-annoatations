package net.javathecode.spring_annotaations.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {

    @Autowired
    private Environment environment;

    //@Value("${mail.host}")
    private String host;

    //@Value("${mail.email}")
    private String email;

    //@Value("${mail.password}")
    private String password;

    //@Value("${app.name}")
    private String appName;

    //@Value("${app.version}")
    private String appVersion;

    public String getAppName() {
        return environment.getProperty("app.name");
    }

    public String getAppVersion() {
        return environment.getProperty("app.version");
    }

    public String getHost() {
        return environment.getProperty("mail.host");
    }

    public String getEmail() {
        return environment.getProperty("mail.email");
    }

    public String getPassword() {
        return environment.getProperty("mail.password");
    }
}
