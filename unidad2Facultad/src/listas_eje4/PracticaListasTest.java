package listas_eje4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PracticaListasTest {

	@Test
	public void InvertirTest() {
		PracticaListas aux = new PracticaListas();
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> esperado = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
		
		System.out.println(aux.invertirLista(l1));
		assertEquals(esperado, aux.invertirLista(l1));
	}

}
