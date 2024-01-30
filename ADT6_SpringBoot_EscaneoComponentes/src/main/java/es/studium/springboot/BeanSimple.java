package es.studium.springboot;

import org.springframework.stereotype.Component;

@Component
public class BeanSimple {
	public String mensaje() {
		return "Este es un bean de tipo: BeanSimple";
	}
}