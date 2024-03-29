package es.studium.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	public static void main(String[] args) {
		/*Abrimos el contenedor de IoC indicando la ruta exacta 
		de donde se encuentra el fichero beans.xml */
		ApplicationContext appContext = new
				ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		Cliente c = appContext.getBean("cliente", Cliente.class);
		System.out.println(c);
		((ConfigurableApplicationContext) appContext).close();
	}
}