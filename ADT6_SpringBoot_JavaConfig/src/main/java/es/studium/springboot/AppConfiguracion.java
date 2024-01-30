package es.studium.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguracion {
	@Bean
	public NumeroAleatorio numeroAleatorio() {
		return new NumeroAleatorio();
	}

	@Bean
	public LetraAleatoria letraAleatoria() {
		return new LetraAleatoria();
	}
}
