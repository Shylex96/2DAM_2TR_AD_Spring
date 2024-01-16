package es.studium.anotaciones;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saludo {
	@Value("${mensaje}")
	private String mensaje;
	public String saludo() {
		return mensaje;
	}
}