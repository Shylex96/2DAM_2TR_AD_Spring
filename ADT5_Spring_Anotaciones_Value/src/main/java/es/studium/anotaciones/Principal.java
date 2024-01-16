package es.studium.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {

		ApplicationContext appContext = new
				AnnotationConfigApplicationContext(AppConfig.class);
		Saludo s = appContext.getBean(Saludo.class);
		System.out.println(s.saludo());
		((AnnotationConfigApplicationContext) appContext).close();
	}
}