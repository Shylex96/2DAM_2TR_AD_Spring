package es.studium.mapeador;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import es.studium.modelo.Cliente;

public class ClienteMapeador implements RowMapper<Cliente> {
	public Cliente mapRow(ResultSet rs, int rowNum) throws
	SQLException {
		Cliente cliente = new Cliente();
		cliente.setId(rs.getInt("ID"));
		cliente.setNombre(rs.getString("NOMBRE"));
		cliente.setPais(rs.getString("PAIS"));
		cliente.setTelefono(rs.getString("TELEFONO"));
		cliente.setEdad(rs.getInt("EDAD"));
		return cliente;
	}
}