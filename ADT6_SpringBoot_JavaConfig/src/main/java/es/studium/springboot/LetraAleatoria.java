package es.studium.springboot;

import java.util.Random;

public class LetraAleatoria {
	
	public String random() {
		String letras = "abcdefghijklmnopqrstuvwxyz";
		int index = new Random().nextInt(letras.length());
		return letras.substring(index, index + 1);
	}
}