package es.studium.springboot;

import java.util.Random;

public class NumeroAleatorio {
	public Integer random() {
		return new Random().nextInt(9000) + 1000;
	}
}