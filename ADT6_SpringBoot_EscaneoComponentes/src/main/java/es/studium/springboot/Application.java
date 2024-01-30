package es.studium.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import es.jose.spring.beans.BeanJose;
import es.maria.spring.beans.BeanMaria;

@SpringBootApplication
@ComponentScan({ "es.studium.*", "es.maria.*", "es.jose.*" })
public class Application implements CommandLineRunner {
	@Autowired
	private BeanSimple beanSimple;
	@Autowired
	private BeanMaria beanMaria;
	@Autowired
	private BeanJose beanJose;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(beanSimple.mensaje());
		System.out.println(beanMaria.mensaje());
		System.out.println(beanJose.mensaje());
	}
}