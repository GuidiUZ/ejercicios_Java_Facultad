package excepciones_ejercicio_1;

public class Main {

	public static void main(String[] args) {

		try {
			Exception e = new Exception("Nueva Excepcion");
			throw e;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Paso por aqui");
		}
	}

}
