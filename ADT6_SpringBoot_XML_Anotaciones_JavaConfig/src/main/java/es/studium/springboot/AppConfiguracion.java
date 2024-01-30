package es.studium.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguracion {
	@Bean
	public BarajadorDeArrays randomNumber() {
		return new BarajadorDeArrays();
	}
}