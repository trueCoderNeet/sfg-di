package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nGreetingEnglishService implements  GreetingService{

    @Override
    public String saygreeting() {
        return "Hello World -EN";
    }
}
