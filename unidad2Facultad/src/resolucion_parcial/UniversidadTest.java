package resolucion_parcial;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniversidadTest {

	@Test
	public void universidadConstructorTest() {
		Universidad universidad = new Universidad(5);
		assertNotNull(universidad);
	}

	
	@Test
	public void universidadAgregarEstudianteTest() {
		Universidad universidad = new Universidad(2);
		Estudiante arquitecto = new Arquitecto("005", 4);
		Estudiante abogado = new Abogado("003", 2);
		Estudiante abogado2 = new Abogado("004", 2);
		
		universidad.agregarEstudiantes(arquitecto);
		universidad.agregarEstudiantes(abogado);
		universidad.agregarEstudiantes(abogado2);
		
		assertEquals(2, universidad.getEstudiantes().size());
	}
	
	
	@Test
	public void calcularCuotaTest() {
		Universidad universidad = new Universidad(5);
		
		Estudiante arquitecto = new Arquitecto("005", 4);
		Estudiante abogado = new Abogado("003", 2);
		
		universidad.agregarEstudiantes(arquitecto);
		universidad.agregarEstudiantes(abogado);
		
		assertEquals(new Double(220.0), universidad.getTotalMensualDeCuotas());
	}
	
}
