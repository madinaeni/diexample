package guru.springframework.services;

public class HelloWorldServicePolishImpl implements HelloWorldService{

    @Override
    public String getGreeting() {
        return "Polish Hello World!";
    }
}
