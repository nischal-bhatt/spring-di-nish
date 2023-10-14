package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class GreetingServiceImplSpringWayTwo implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hi from Spring way 2!";
    }
}
