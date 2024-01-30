package es.studium.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({ "otro.properties" })
public class AppConfiguracion {
	@Autowired
	private Environment environment; // Objeto que nos permite trabajar //con ficheros properties

	@Bean(name = "registroSimple")
	RegistroSimple getRegistro() {
		return new RegistroSimple();
	}

	@Bean(name = "registroConPropiedad")
	RegistroSimple getRegistroConPropiedad() {
		return new RegistroSimple(environment.getProperty("registro.prefijo", String.class),
				environment.getProperty("registro.muestraFecha", Boolean.class));
	}

	@Bean(name = "registroConOtrasPropiedades")
	RegistroSimple getRegistroConOtrasPropiedades() {
		return new RegistroSimple(environment.getProperty("otroregistro.prefijo", String.class),
				environment.getProperty("otroregistro.muestraFecha", Boolean.class));
	}
}
