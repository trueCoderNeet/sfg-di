package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);



		PetController petController = (PetController)ctx.getBean("petController");
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18Controller=(I18nController)ctx.getBean("i18nController");
		System.out.println("-----i18n ------");
		System.out.println(i18Controller.sayGreeting());

		MyController myController=(MyController)ctx.getBean("myController");
		/*String greeting = myController.sayHello();
		System.out.println(greeting);*/

		System.out.println("-----PrimaryBean------");
		System.out.println(myController.sayHello());

		System.out.println("-----Property------");
		PropertyInjectorController propertyInjectorController =(PropertyInjectorController)ctx.getBean("propertyInjectorController");
		System.out.println(propertyInjectorController.getGreeting());

		System.out.println("-----Setter------");
		SetterInjectedController setterInjectedController =(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----Constructor------");
		ConstructorInjectorController constructorInjectorController=(ConstructorInjectorController) ctx.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());
	}

}
