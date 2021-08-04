package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectorGreetingService implements  GreetingService{
    @Override
    public String saygreeting() {
        return "Hello World- Setter";
    }
}
