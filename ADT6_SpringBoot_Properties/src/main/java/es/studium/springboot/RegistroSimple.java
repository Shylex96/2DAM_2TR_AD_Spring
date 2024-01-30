package es.studium.springboot;

import java.util.Date;

public class RegistroSimple {
	private String prefijo;
	private Boolean muestraFecha;

	public RegistroSimple() {
		prefijo = "";
		/*
		 * Lo establecemos a true, para que muestre el valor de la fecha en la
		 * configuración por defecto que estableceremos más adelante.
		 */
		muestraFecha = true;
	}

	public RegistroSimple(String prefijo, Boolean muestraFecha) {
		this.prefijo = prefijo;
		this.muestraFecha = muestraFecha;
	}

	public String log(String mensaje) {
		String fecha = getDate();
		return prefijo + fecha + " ----> " + mensaje;
	}

	private String getDate() {
		return muestraFecha ? new Date().toString() : "";
	}

	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	public Boolean getMuestraFecha() {
		return muestraFecha;
	}

	public void setMuestraFecha(Boolean muestraFecha) {
		this.muestraFecha = muestraFecha;
	}
}