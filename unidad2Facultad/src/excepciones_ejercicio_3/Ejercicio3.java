package excepciones_ejercicio_3;

public class Ejercicio3 {

	
	public static void main(String[] args) {
		
		int arreglo[] = new int[3];
		
		try {
			arreglo[5] = 6;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
