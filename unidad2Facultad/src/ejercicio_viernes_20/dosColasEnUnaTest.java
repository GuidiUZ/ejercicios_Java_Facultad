package ejercicio_viernes_20;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

class dosColasEnUnaTest {

	@Test
	public void ColasJuntastest() {
		Queue<Integer> cola1 = new LinkedList<Integer>();
		Queue<Integer> cola2 = new LinkedList<Integer>();
		Queue<Integer> esperada = new LinkedList<Integer>();
		cola1.addAll(Arrays.asList(1,2,3,4));
		cola2.addAll(Arrays.asList(5,6,7,8));
		esperada.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
		
		DosColasEnUna colita = new DosColasEnUna();
		assertEquals(esperada,colita.dosColasEnUna(cola1, cola2));
		
	}

}
