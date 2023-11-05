package excepciones_ejercicio_6;

public abstract class CuentaBancaria {
	
	private Double saldo;
	private String dni;
	
	public CuentaBancaria(Double saldo, String dni) {
		this.saldo = saldo;
		this.dni = dni;
	}

	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double d) {
		
		this.saldo -= d;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void ingresarSaldo(Double saldo) {
		this.saldo += saldo;
	}
	
	public abstract double retirarSaldo(double saldo) throws SaldoNegativoException;
	
	
}
