package es.studium.dao;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import es.studium.mapeador.ClienteMapeador;
import es.studium.modelo.Cliente;

public class JdbcClienteDAO implements ClienteDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	@Override
	public void insertar(String nombre, String pais, String
			telefono, Integer edad) {
		String SQL = "insert into Cliente (NOMBRE, PAIS, TELEFONO, EDAD) values (?, ?, ?, ?)"; jdbcTemplateObject.update(SQL, nombre, pais, telefono, edad);
				System.out.println("Nombre del registro creado: " +
						nombre + " País: "
						+ pais + " Teléfono: " + telefono + " Edad:" + edad);
	}
	@Override
	public Cliente seleccionarId(Integer id) {
		String SQL = "select * from Cliente where id = ?";
		Cliente cliente =
				jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new
						ClienteMapeador());
		return cliente;
	}
	@Override
	public List<Cliente> seleccionarTodos() {
		String SQL = "select * from Cliente";
		List<Cliente> clientes =jdbcTemplateObject.query(SQL, new ClienteMapeador());
		return clientes;
	}
	@Override
	public void eliminar(Integer id) {
		String SQL = "delete from Cliente where ID = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Registro eliminado con ID = " +
				id);
	}
	@Override
	public void actualizar(Integer id, String nombre) {
		String SQL = "update Cliente set NOMBRE = ? where ID = ?";
						jdbcTemplateObject.update(SQL, nombre, id);
		System.out.println("Registro actualizado con ID = "+ id);
	}
}