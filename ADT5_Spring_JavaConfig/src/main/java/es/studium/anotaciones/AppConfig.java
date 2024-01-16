package es.studium.anotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Saludar saludar() {
		return new Saludar();
	}
}