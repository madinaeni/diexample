package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
// .properties file will OVERRIDE the profile
// DEFAULT kicks in if no profile in properties file is specified
//@Profile({"default","english"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService{

    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}
