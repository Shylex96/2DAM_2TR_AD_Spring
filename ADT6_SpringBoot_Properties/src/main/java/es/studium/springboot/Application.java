package es.studium.springboot;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	@Resource(name = "registroSimple")
	private RegistroSimple registroSimple;
	@Autowired
	@Resource(name = "registroConPropiedad")
	private RegistroSimple registroConPropiedad;
	@Autowired
	@Resource(name = "registroConOtrasPropiedades")
	private RegistroSimple registroConOtrasPropiedades;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(registroSimple.log("Probando el registrador con la configuración por defecto."));
		System.out.println(registroConPropiedad
				.log("Probando el registrador con las propiedades del fichero application.properties."));
		System.out.println(registroConOtrasPropiedades
				.log("Probando el registrador con las propiedades del fichero otro.properties."));
	}
}