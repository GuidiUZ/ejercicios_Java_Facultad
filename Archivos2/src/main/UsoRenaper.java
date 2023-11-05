package main;

public class UsoRenaper {

	public static void main(String[] args) {
		
		RENAPER renaper = new RENAPER();
		renaper.agregarPersona(new Persona("Pablo", 38));
		renaper.agregarPersona(new Persona("Martin", 28));
		renaper.agregarPersona(new Persona("Guido", 25));
		renaper.agregarPersona(new Persona("Dario", 33));
		renaper.agregarPersona(new Persona("Camila", 22));

	}

}
