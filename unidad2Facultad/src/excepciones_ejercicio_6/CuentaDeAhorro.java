package excepciones_ejercicio_6;

public class CuentaDeAhorro extends CuentaBancaria {

	public CuentaDeAhorro(Double saldo, String dni) {
		super(saldo, dni);
	}
	
	@Override
	public double retirarSaldo(double saldoARetirar) throws SaldoNegativoException {
		if (saldoARetirar > this.getSaldo()) {
			throw new SaldoNegativoException(saldoARetirar, this.getSaldo());
		}
		
		this.setSaldo(super.getSaldo() - saldoARetirar);
		return super.getSaldo();
	}

	

}
