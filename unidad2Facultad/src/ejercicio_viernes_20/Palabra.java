package ejercicio_viernes_20;

import java.util.Queue;
import java.util.Stack;

public class Palabra {

	public Palabra() {
		
	}
	
	
	public String invertirPalabra(String palabra) {
		String s = "";
		Stack<Character> pila = new Stack<Character>();
		
		
		for (int i = 0; i < palabra.length(); i++) {
			pila.push(palabra.charAt(i));
		}
		
		
		while (!pila.empty()) {
			s += pila.pop();
		}
		
		return s;
	}
	
	
	public boolean esPalindromo(String palabra) {
		String minus = palabra;
		
		return minus.equals(invertirPalabra(minus));
		
	}
	
	
	
	
	
	
	
	
	
	
}
