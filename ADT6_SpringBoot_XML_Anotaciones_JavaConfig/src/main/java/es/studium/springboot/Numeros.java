package es.studium.springboot;

public class Numeros {
	private Integer[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public Integer[] getNumeros() {
		return numeros;
	}

	public void setNumeros(Integer[] numeros) {
		this.numeros = numeros;
	}

	@Override
	public String toString() {
		String todas = "";
		for (Integer numero : numeros) {
			todas = todas + numero + ", ";
		}
		return todas;
	}
}
