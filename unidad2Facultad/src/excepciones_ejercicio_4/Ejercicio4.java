package excepciones_ejercicio_4;

public class Ejercicio4 {

	public static void main(String[] args) {
		try {
			throw new Ejercicio4Exception("Excepcion para el ejercicio 4");
		} catch (Ejercicio4Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
