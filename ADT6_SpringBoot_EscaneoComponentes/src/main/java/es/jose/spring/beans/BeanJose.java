package es.jose.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanJose {
	public String mensaje() {
		return "Este es un bean de tipo: BeanJose";
	}
}