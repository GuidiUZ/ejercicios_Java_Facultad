package excepciones_ejercicio_6;

import java.util.Iterator;
import java.util.List;

public class Banco {

	private List<CuentaBancaria> cuentasBancarias;
	
	public Banco(List<CuentaBancaria> cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}
	
	
	public double totalSaldo() {
		double totalSaldo = 0.0;
		for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
			totalSaldo += cuentaBancaria.getSaldo();
		}
		return totalSaldo;
	}
	
}
