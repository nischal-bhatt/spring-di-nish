package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;


    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
        System.out.println(this.environmentService.getEnvironment());
    }

    public String getEnvironment() {
        return "you are in " + this.environmentService.getEnvironment();
    }
}
