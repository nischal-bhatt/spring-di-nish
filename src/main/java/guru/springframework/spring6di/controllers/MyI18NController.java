package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {

    private final GreetingService greetingService;

    public MyI18NController(@Qualifier("i18nService")GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println(this.greetingService.sayGreeting() + " nishi b ");
    }


    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
