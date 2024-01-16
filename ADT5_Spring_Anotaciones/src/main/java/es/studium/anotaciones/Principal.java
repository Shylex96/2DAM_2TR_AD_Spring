package es.studium.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		ApplicationContext appContext = new
				ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		/* Obtenemos los beans */
		Mundo m = appContext.getBean("mundo", Mundo.class);
		System.out.println(m.getSaludo());
		Poblacion p = appContext.getBean("Pob", Poblacion.class);
		System.out.println("La población de: " + p.getNombre() + " es de " + p.getCantidadHabitantes() + " habitantes en 2023.");
		((ConfigurableApplicationContext) appContext).close();
	}
}