package ejercicio_stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SupermercadoTest {

	@Test
	public void ColaVaciatest() {
		Supermercado supermercado = new Supermercado();
		assertNotNull(supermercado);
		assertTrue(supermercado.getColaRapida().isEmpty());
		assertTrue(supermercado.getColaNormal().isEmpty());
	}
	
	
	@Test
	public void agregarColaRapidaTest() {
		Supermercado supermercado = new Supermercado();
		List<String> productos = new ArrayList<String>();
		productos.add("papa");
		productos.add("arroz");
		productos.add("mayonesa");
		productos.add("lavandina");
		Cliente cliente = new Cliente(productos);
		
		List<String> productos2 = new ArrayList<String>();
		productos2.add("batata");
		productos2.add("fideos");
		productos2.add("ketchup");
		productos2.add("detergente");
		Cliente cliente2 = new Cliente(productos2);
		
		
		supermercado.agregarNuevoCliente(cliente);
		supermercado.agregarNuevoCliente(cliente2);
		
		assertEquals(2, supermercado.getColaRapida().size());
	}
	
//	@Test
//	public void agregarColarNormal() {
//		Supermercado supermercado = new Supermercado();
//		List<String> productos = new ArrayList<String>();
//		productos.add("papa");
//		productos.add("arroz");
//		productos.add("mayonesa");
//		productos.add("lavandina");
//		//Se necesitan mas de 5 productos
//		Cliente cliente = new Cliente(productos);
//		
//		assertEquals(0, supermercado.getColaNormal().size());
//	}
	
	
	@Test
	public void removeObjectTest() {
		String papa = "papa";
		List<String> productos = new ArrayList<String>();
		productos.add(papa);
		productos.add("arroz");
		productos.add("mayonesa");
		productos.add("lavandina");
		Cliente cliente = new Cliente(productos);
		cliente.quitarProductoPorObjeto(papa);
	}

}
