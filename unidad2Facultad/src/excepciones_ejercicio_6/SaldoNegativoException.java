package excepciones_ejercicio_6;

public class SaldoNegativoException extends Exception{

	private static final long serialVersionUID = 11;
	
	public SaldoNegativoException(double saldoARetirar, double saldo) {
		super("Error" + saldoARetirar + "excede el saldo de la cuenta" + saldo);
	}
	
}
