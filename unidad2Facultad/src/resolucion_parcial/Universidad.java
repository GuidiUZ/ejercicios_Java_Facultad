package resolucion_parcial;

import java.util.ArrayList;
import java.util.Collections;

public class Universidad {

	private ArrayList <Estudiante> estudiantes;
	private int cantidadMaximaDeEstudiantesQueAdmite;
	private static final double CUOTA_BASE = 100; 
	
	public Universidad(int cantidadMaximaDeEstudiantesQueAdmite) {
		this.cantidadMaximaDeEstudiantesQueAdmite = cantidadMaximaDeEstudiantesQueAdmite;
		estudiantes = new ArrayList<>();
	}
	
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}


	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}


	public int getCantidadMaximaDeEstudiantesQueAdmite() {
		return cantidadMaximaDeEstudiantesQueAdmite;
	}


	public void setCantidadMaximaDeEstudiantesQueAdmite(int cantidadMaximaDeEstudiantesQueAdmite) {
		this.cantidadMaximaDeEstudiantesQueAdmite = cantidadMaximaDeEstudiantesQueAdmite;
	}


	public void agregarEstudiantes(Estudiante estudiante) {
		
		if ( estudiantes.size() <= cantidadMaximaDeEstudiantesQueAdmite)
			estudiantes.add(estudiante);
	}
	
	
	public double getTotalMensualDeCuotas() {
		double totalMensualCuotas = 0.0;
		for (Estudiante estudiante : estudiantes) {
			totalMensualCuotas += estudiante.calcularCuota(CUOTA_BASE);
		}
		
		return totalMensualCuotas;
	}
	
	
	public void listarPlanillaDeEstudiantes() {
		Collections.sort(estudiantes);
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante + "Cuota que abona" + estudiante.calcularCuota(CUOTA_BASE));
		}
	}
	
}
