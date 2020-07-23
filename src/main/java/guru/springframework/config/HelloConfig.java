package guru.springframework.config;

import guru.springframework.services.HelloWorldFactory;
import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    // This will be injected downstairs
    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    // Alternative way to define beans
    // Used especially with 3rd party code : h2 , sql connections
    @Bean
    @Profile("english")
    @Primary
    // HelloWorldFactory factory is being injected after the initialisation that is made up
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
        //return new HelloWorldServiceEnglishImpl();
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
        //return new HelloWorldServiceSpanishImpl();
        return factory.createHelloWorldService("es");
    }

    @Bean(name="french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory) {
        return factory.createHelloWorldService("fr");
    }

    @Bean
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
        return factory.createHelloWorldService("de");
    }

    @Bean
    public HelloWorldService helloWorldServicePolish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory) {
        return factory.createHelloWorldService("ru");
    }
}
