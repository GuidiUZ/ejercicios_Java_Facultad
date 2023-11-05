package excepciones_ejercicio_2;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		String str = null;

		try {
			str.charAt(2);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
