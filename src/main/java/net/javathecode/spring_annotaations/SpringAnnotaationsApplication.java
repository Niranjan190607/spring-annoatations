package net.javathecode.spring_annotaations;

import net.javathecode.spring_annotaations.controller.PizzaController;
import net.javathecode.spring_annotaations.lazy.LazyLoader;
import net.javathecode.spring_annotaations.propertysource.PropertySourceDemo;
import net.javathecode.spring_annotaations.scope.PrototypeBean;
import net.javathecode.spring_annotaations.scope.SingletonBean;
import net.javathecode.spring_annotaations.service.VegPizza;
import net.javathecode.spring_annotaations.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotaationsApplication {

	public static void main(String[] args) {

		var context=SpringApplication.run(SpringAnnotaationsApplication.class, args);
		PizzaController controller = (PizzaController)context.getBean("pizzaController");

		System.out.println(controller.getPizza());

		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

		SingletonBean singletonBean1= context.getBean(SingletonBean.class);
		SingletonBean singletonBean2= context.getBean(SingletonBean.class);
		SingletonBean singletonBean3= context.getBean(SingletonBean.class);

		PrototypeBean prototypeBean1= context.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean2= context.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean3= context.getBean(PrototypeBean.class);

		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
		System.out.println(valueAnnotationDemo.getDefaultName());
		System.out.println(valueAnnotationDemo.getJavaHome());

		/*VegPizza vegPizza = context.getBean(VegPizza.class);
		System.out.println(vegPizza.getPizza());*/

		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getAppName());
		System.out.println(propertySourceDemo.getAppVersion());

	}

}
