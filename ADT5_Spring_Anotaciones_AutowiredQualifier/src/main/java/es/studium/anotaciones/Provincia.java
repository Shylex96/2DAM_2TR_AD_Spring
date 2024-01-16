package es.studium.anotaciones;

public class Provincia {

	private String nombre;
	public Provincia() { }
	public Provincia(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + "]";
	}
}