package ejercicio_viernes_20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExpresionBalanceada {

	private Set<Character> deApertura = new HashSet<Character>();
	private Map<Character, Character> parejita = new HashMap<Character, Character>();
	
	public ExpresionBalanceada() {
		this.deApertura.add('{');
		this.deApertura.add('[');
		this.deApertura.add('(');
		
		
		this.parejita.put('}', '{');
		this.parejita.put(']', '[');
		this.parejita.put(')', '(');
	}
	
	public boolean esDeApertura(char c) {
		return deApertura.contains(c);
	}
	
	
	public boolean esLaParejita(Character abre, Character cierra) {
		return this.parejita.get(cierra).equals(abre);
	}
	
	
	
	
}
