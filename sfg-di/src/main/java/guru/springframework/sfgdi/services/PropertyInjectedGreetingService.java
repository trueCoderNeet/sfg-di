package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String saygreeting() {
        return "Hello World property";
    }
}
