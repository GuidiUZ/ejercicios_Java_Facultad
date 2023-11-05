package ejercicio_stack;

import java.util.Collection;
import java.util.List;

public class Cliente {
	
	private int numeroEnCola;
	private List<String> productos;
	
	public Cliente(List<String> productos) {
		this.productos = productos;
		this.numeroEnCola =  -1;
	}

	public int getNumeroEnCola() {
		return numeroEnCola;
	}

	public void setNumeroEnCola(int numeroEnCola) {
		this.numeroEnCola = numeroEnCola;
	}

	public List<String> getProductos() {
		return productos;
	}

	public void setProductos(List<String> productos) {
		this.productos = productos;
	}

	
	@Override
	public String toString() {
		return "Cliente [numeroEnCola=" + numeroEnCola + ", productos=" + productos + "]";
	}
	
	
	public void agregarProductos(String producto) {
		productos.add(producto);
	}
	
	
	public void quitarProductoPorObjeto(String producto) {
		productos.remove(producto);
	}
	
	public void quitarProductoPorIndice(int i) {
		if (i < productos.size() - 1) {
			productos.remove(i);
		}
	}
	
	public void quitarProductoPorColecction(Collection <String> productosAEliminar) {
		productos.removeAll(productosAEliminar);
	}
}
 