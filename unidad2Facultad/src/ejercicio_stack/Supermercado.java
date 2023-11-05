package ejercicio_stack;

import java.util.LinkedList;
import java.util.Queue;

public class Supermercado {

	private Queue<Cliente> colaNormal;
	private Queue<Cliente> colaRapida;
	
	public Supermercado() {
		colaNormal = new LinkedList<Cliente>();
		colaRapida = new LinkedList<Cliente>();
	}
	
	
	public void agregarNuevoCliente(Cliente cliente) {
		
		if(cliente.getProductos().size() >= 5) {
			agregarCliente(cliente, colaNormal);
		} else {
			agregarCliente(cliente, colaRapida);
		}
		
	}
	
	
	private void agregarCliente(Cliente cliente, Queue<Cliente> cola) {
		cola.add(cliente);
		cliente.setNumeroEnCola(cola.size());
	}

	

	@Override
	public String toString() {
		return "Supermercado [colaNormal=" + colaNormal + ", colaRapida=" + colaRapida + "]";
	}


	public Queue<Cliente> getColaNormal() {
		return colaNormal;
	}


	public void setColaNormal(Queue<Cliente> colaNormal) {
		this.colaNormal = colaNormal;
	}


	public Queue<Cliente> getColaRapida() {
		return colaRapida;
	}


	public void setColaRapida(Queue<Cliente> colaRapida) {
		this.colaRapida = colaRapida;
	}
	
	
	
	
	
}
