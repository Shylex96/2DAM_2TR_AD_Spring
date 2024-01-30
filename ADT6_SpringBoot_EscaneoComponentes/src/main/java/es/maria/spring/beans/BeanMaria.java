package es.maria.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanMaria {
	public String mensaje() {
		return "Este es un bean de tipo: BeanMaria ";
	}
}