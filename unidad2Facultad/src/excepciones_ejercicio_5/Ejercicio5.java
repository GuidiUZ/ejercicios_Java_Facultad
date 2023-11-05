package excepciones_ejercicio_5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Boolean continuar = Boolean.TRUE;
		while(continuar) {
			try {
				System.out.print("Introduce un numero entero: ");
				Scanner scanner = new Scanner(System.in);
				Integer numero = scanner.nextInt();
				scanner.close();
				System.out.println("El cuadrado de " + numero + " = " + (numero * numero));
				continuar = Boolean.FALSE;
			} catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
