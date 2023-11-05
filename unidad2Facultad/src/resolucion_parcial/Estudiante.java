package resolucion_parcial;

public abstract class Estudiante implements Comparable<Estudiante>{

	private String numeroLegajo;
	private int cantidadMaterias;

	public Estudiante(String numeroLegajo, int cantidadMaterias) {
		this.numeroLegajo = numeroLegajo;
		if (cantidadMaterias <= 5) {
			this.cantidadMaterias = cantidadMaterias;
		} else {
			cantidadMaterias = 1;
		}
	}

	public String getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(String numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public int getCantidadMaterias() {
		return cantidadMaterias;
	}


	public void setCantidadMaterias(int cantidadMaterias) {
		this.cantidadMaterias = cantidadMaterias;
	}


	public abstract double getPlus();

	public double calcularCuota(double cuotaBase) {
		return cuotaBase + (cuotaBase * getPlus() * cantidadMaterias);
	}

	@Override
	public String toString() {
		return "Numero de legajo: " + numeroLegajo + "Cantidad Materias: " + cantidadMaterias;
	}

	
	public int compareTo(Estudiante estudiante) {
		return numeroLegajo.compareTo(estudiante.getNumeroLegajo());
	} 
	
}
