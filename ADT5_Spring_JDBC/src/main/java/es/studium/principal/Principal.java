package es.studium.principal;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import es.studium.dao.JdbcClienteDAO;
import es.studium.modelo.Cliente;

public class Principal {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		JdbcClienteDAO clienteDAO = context.getBean("clienteJDBCTemplate", JdbcClienteDAO.class);
		System.out.println("Creando clientes.....................");
		clienteDAO.insertar("Ramón", "España", "654987321", 45);
		clienteDAO.insertar("Juan", "UK", "012365478", 65);
		clienteDAO.insertar("Omer", "Italia", "11223344", 40);
		clienteDAO.insertar("María José", "España", "954789456",45);
		clienteDAO.insertar("Esteban", "España", "686856307", 27);
		System.out.println();
		seleccionarTodosClientes(clienteDAO);
		System.out.println("Actualizando cliente con ID = 5............");
		clienteDAO.actualizar(5, "Pedro");
		System.out.println();
		System.out.println("Lista de clientes con ID = 5.............");
		Cliente cliente = clienteDAO.seleccionarId(5);
		System.out.print("ID : " + cliente.getId());
		System.out.println(", Name : " + cliente.getNombre());
		System.out.println();
		System.out.println("Eliminando cliente con ID=3...............");
		clienteDAO.eliminar(3);
		seleccionarTodosClientes(clienteDAO);	
	}
	
	private static void seleccionarTodosClientes(JdbcClienteDAO
			clienteDAO) {
		System.out.println("Lista de clientes.......................");
		List<Cliente> clientes = clienteDAO.seleccionarTodos();
		for (Cliente registro : clientes) {
			System.out.print("ID : " + registro.getId());
			System.out.print(", Nombre : " +
					registro.getNombre());
			System.out.print(", País : " + registro.getPais());
			System.out.print(", Teléfono : " +
					registro.getTelefono());
			System.out.println(", Edad : " +
					registro.getEdad());
		}
		System.out.println();
	}
}