package ejercicio_viernes_20;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DosColasEnUna {

	
	public Queue<Integer> dosColasEnUna(Queue<Integer> q1, Queue<Integer> q2) {
		Queue<Integer> aux = new LinkedList<Integer>();
		
		while(!q1.isEmpty()) {
			aux.offer(q1.poll());
		}
		
		
		while(!q2.isEmpty()) {
			aux.offer(q2.poll());
		}
		
		return aux;
	}
	
}
