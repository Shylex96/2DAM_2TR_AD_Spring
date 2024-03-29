package es.studium.anotaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Persona {
	
	private String nombre;
	@Autowired
	@Qualifier("MairenaAljarafe")
	private Poblacion poblacion;
	
	public Persona() {
	}
	
	public Persona(String nombre, Poblacion poblacion) {
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Poblacion getPoblacion() {
		return poblacion;
	}
	
	public void setPoblacion(Poblacion poblacion) {
		this.poblacion = poblacion;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}
}
