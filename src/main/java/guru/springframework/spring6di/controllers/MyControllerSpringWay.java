package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyControllerSpringWay {

    private final GreetingService greetingService;

    public MyControllerSpringWay(@Qualifier("customName")GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println(greetingService.sayGreeting() + " +nish ");
    }

    public String sayHello() {
        System.out.println("Im in controller with spring way");

        return greetingService.sayGreeting();
    }

    public void beforeInit() {
        System.out.println("test!!!!!!");
    }
}
