package springboot;

import guru.springframework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// If declared beans are not in the same package as this starter class
//@ComponentScan("guru.springframework")

// Used with .xml files spring configuration
@ImportResource("classpath:/spring/spring-config.xml")
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

        greetingController.sayHello();
    }

}
