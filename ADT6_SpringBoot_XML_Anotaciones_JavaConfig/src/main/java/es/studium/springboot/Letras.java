package es.studium.springboot;

public class Letras {
	private String[] letras = { "a", "b", "c", "d", "e", "f", "g", "h" };

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	@Override
	public String toString() {
		String todas = "";
		for (String letra : letras) {
			todas = todas + letra + ", ";
		}
		return todas;
	}
}