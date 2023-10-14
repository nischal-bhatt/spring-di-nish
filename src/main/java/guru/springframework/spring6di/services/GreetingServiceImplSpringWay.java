package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("customName")
public class GreetingServiceImplSpringWay implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hi from Spring way custom!";
    }
}
