package es.studium.springboot;

import java.util.Random;

public class BarajadorDeArrays {
	private Random random = new Random();

	public Object[] barajar(Object[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = random.nextInt(array.length);
			int k = random.nextInt(array.length);
			Object tmp = array[j];
			array[j] = array[k];
			array[k] = tmp;
		}
		return array;
	}
}