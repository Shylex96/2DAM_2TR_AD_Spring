package com.example.springBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pais {
	@Value("España")
	private String nombre;
	@Value("Europa")
	private String continente;
	public Pais () {
		nombre = "";
		continente = "";
	}
	public Pais(String nombre, String continente) {
		this.nombre = nombre;
		this.continente = continente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinent(String continente) {
		this.continente = continente;
	}
	@Override
	public String toString() {
		return "País [nombre=" + nombre + ", continente=" + continente + "]";
	}
}