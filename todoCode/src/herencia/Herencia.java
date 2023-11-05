package herencia;

public class Herencia {

	public static void main(String[] args) {
		
		//Empleado
		Empleado emple = new Empleado();
		Empleado emple2 = new Empleado(14, "4142054", "Guido", "Aranda", "Belgrano 1053", 
				"1142520521", 15, "Gerente", 250000.0);
		System.out.println(emple2.getApellido());
		
		
		
		//Consultor
		Consultor consultor1 = new Consultor(14, "4142054", "Juan", "Andrada", "Periquito 1053", 
				"1142520521", "Nº456", 125);
		
		System.out.println(consultor1.getNombre());
		
		
		
	}

}
