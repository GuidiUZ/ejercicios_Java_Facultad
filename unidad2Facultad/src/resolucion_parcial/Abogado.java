package resolucion_parcial;

public class Abogado extends Estudiante {

	public Abogado(String numeroLegajo, int cantidadMaterias) {
		super(numeroLegajo, cantidadMaterias);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPlus() {
		// TODO Auto-generated method stub
		return 0.05;
	}

}
