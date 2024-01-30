package es.studium.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({ @PropertySource("classpath:miaplicacion.properties"),

	@PropertySource("classpath:logger.properties") })
public class AppConfiguracion {
	@Value("${miaplicacion.nombre}")
	private String nombre;
	@Value("${logger.muestraFecha}")
	private Boolean muestraFecha;
	@Value("${logger.prefijo}")
	private String prefijo;

	@Bean
	public Logger logger() {
		Logger logger = new Logger();
		logger.setPrefijo(nombre + prefijo);
		logger.setMuestraFecha(muestraFecha);
		return logger;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
