package herencia;

public class Consultor extends Persona {
	
	private String num_consultora;
	private int num_cons;
	
	public Consultor(int id, String dni, String nombre, String apellido, String domicilio, 
			String telefono,
			String num_consultora, int num_cons) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.num_consultora = num_consultora;
		this.num_cons = num_cons;
	}

	public String getNum_consultora() {
		return num_consultora;
	}

	public void setNum_consultora(String num_consultora) {
		this.num_consultora = num_consultora;
	}

	public int getNum_cons() {
		return num_cons;
	}

	public void setNum_cons(int num_cons) {
		this.num_cons = num_cons;
	}
	
	
	
	
	

}
