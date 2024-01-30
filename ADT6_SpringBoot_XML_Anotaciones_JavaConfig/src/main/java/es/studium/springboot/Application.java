package es.studium.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private BarajadorDeArrays barajadorDeArrays;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Letras misLetras = context.getBean("beanLetras", Letras.class);
		Numeros misNumeros = context.getBean("beanNumeros", Numeros.class);

		System.out.println("Todas las letras: " + misLetras.toString());
		System.out.println("Tosos los números: " + misNumeros.toString());

		misLetras.setLetras((String[]) barajadorDeArrays.barajar(misLetras.getLetras()));
		misNumeros.setNumeros((Integer[]) barajadorDeArrays.barajar(misNumeros.getNumeros()));
		System.out.println("Todas las letras barajadas: " + misLetras.toString());
		System.out.println("Tosos los números barajados: " + misNumeros.toString());

	}
}