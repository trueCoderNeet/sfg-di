package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectorControllerTest {
    ConstructorInjectorController controller;

    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectorController(new ConstructorGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}