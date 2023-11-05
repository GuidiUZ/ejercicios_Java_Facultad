package listas_ej2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PracticaListasTest {

	@Test
	public void pruebaOrdenarListaDe2Listas() {
		PracticaListas aux = new PracticaListas();

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 6, 8, 9, 10));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2, 4, 7));

//		l1.addAll(Arrays.asList(1, 3, 5, 6, 8, 9, 10));
//		l2.addAll(Arrays.asList(2, 4, 7));

		List<Integer> esperada = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

		assertEquals(esperada, aux.dosListasEnUna(l1, l2));
	}

}
