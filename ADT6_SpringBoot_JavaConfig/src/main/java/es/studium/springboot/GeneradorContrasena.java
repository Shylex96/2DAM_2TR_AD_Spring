package es.studium.springboot;

import org.springframework.stereotype.Service;

@Service
public class GeneradorContrasena {
	private NumeroAleatorio numeroAleatorio;
	private LetraAleatoria letraAleatoria;

	public GeneradorContrasena(NumeroAleatorio numeroAleatorio, LetraAleatoria letraAleatoria) {
		this.numeroAleatorio = numeroAleatorio;
		this.letraAleatoria = letraAleatoria;
	}

	public String generar() {
		return letraAleatoria.random() + letraAleatoria.random() + letraAleatoria.random() + numeroAleatorio.random();
	}
}