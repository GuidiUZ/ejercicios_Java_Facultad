package excepciones_ejercicio_6;

public class CuentaCorriente extends CuentaBancaria {

	private CuentaDeAhorro cuentaAsociada;
	
	public CuentaCorriente(Double saldo, String dni, CuentaDeAhorro cuentaAsociada) {
		super(saldo, dni);
		this.cuentaAsociada = cuentaAsociada;
	}

	@Override
	public double retirarSaldo(double saldoARetirar) throws SaldoNegativoException {
		double saldo = super.getSaldo();
		
		if (saldoARetirar > saldo) {
			double saldoARetirarCuentaAsociada = saldoARetirar - saldo;
			this.cuentaAsociada.retirarSaldo(saldoARetirarCuentaAsociada);
			super.setSaldo(0);
			return saldoARetirar;
		}
		
		super.setSaldo(saldo - saldoARetirar);
		return saldoARetirar;
	}

}
