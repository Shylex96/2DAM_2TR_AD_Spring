package es.studium.dao;
import java.util.List;
import javax.sql.DataSource;
import es.studium.modelo.Cliente;

public interface ClienteDAO {
	/*Método que se utilizará para inicializar los recursos de
la base de datos, es decir, la conexión.*/
	public void setDataSource(DataSource ds);

	/*Método que se utilizará para crear un registro en la
tabla Cliente.*/
	public void insertar(String nombre, String pais, String
			telefono, Integer edad);

	/*Método que se utilizará para enumerar un registro de la
tabla Cliente correspondiente al id que se pase como parámetro.*/
	public Cliente seleccionarId(Integer id);

	/*Método que se utilizará para enumerar todos los registros
de la tabla clientes.*/
	public List<Cliente> seleccionarTodos();

	/*Método que se utilizará para eliminar un registro de la
tabla de clientes correspondiente al id que se pasa como
parámetro.*/
	public void eliminar(Integer id);

	/*Este es el método que se utilizará para actualizar un
registro en la tabla Cliente.*/
	public void actualizar(Integer id, String nombre);
}