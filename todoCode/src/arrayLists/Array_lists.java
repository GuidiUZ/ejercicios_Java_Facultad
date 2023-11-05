package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Array_lists {

	
	
	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona(1, "Guido", 25));
		lista.add(new Persona(2, "Dario", 33));
		lista.add(new Persona(3, "Pepe", 26));
		lista.add(new Persona(4, "Carlos", 55));
		
		
		for (Persona personita : lista) {
			System.out.println(personita.getName());
		}
	}
	
}
