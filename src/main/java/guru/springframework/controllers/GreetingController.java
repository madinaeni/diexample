package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// By this annotation Spring registeres this class as a bean
@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public GreetingController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);

        return greeting;
    }
}
