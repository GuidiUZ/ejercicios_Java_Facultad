package todoCode;

public class Alumno {

	private int id;
	private String nombre;
	private String apellido;
	
	
	
	//Constructor
	public Alumno(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	//Metodos Get and Set
	
	public int getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}



	public String getApellido() {
		return apellido;
	}
	
	

	//Metodos
	public void mostrarNombre() {
		System.out.println("Puedo decirte mi nombre!");
	}





	
	
	
}
