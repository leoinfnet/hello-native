package service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
    public String getName(){
        return "Hello World";
    }
}
