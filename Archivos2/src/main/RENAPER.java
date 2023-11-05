package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class RENAPER {

	private List<Persona> personas;
	
	public RENAPER() {
		personas = new LinkedList<Persona>();
	}
	
	
	public void agregarPersona(Persona p) {
		
		if (p == null) throw new IllegalArgumentException();
		if (p.getEdad() < 0) throw new EdadException();
		personas.add(p);
	}
	
	public void guardarArchivo(String nombre) {
		File file = new File("resources/" + nombre);
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for (Persona persona : personas) {
				bw.write(persona.toString());
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (bw != null) {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
