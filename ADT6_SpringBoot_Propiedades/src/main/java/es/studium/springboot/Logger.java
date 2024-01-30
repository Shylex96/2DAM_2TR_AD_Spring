package es.studium.springboot;

import java.util.Date;

public class Logger {
	private String prefijo;
	private Boolean muestraFecha;

	public Logger() {
		prefijo = "";
		muestraFecha = false;
	}

	public Logger(String prefijo, Boolean muestraFecha) {
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