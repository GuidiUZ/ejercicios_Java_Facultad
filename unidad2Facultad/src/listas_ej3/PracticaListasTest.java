package listas_ej3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PracticaListasTest {

	@Test
	public void eliminarDuplicadostest() {
		PracticaListas aux = new PracticaListas();
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,2,1,4,2,4,3));
		List<Integer> esperada = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 3));
		
		assertEquals(esperada, aux.eliminarDuplicados(l1));
	}

}
