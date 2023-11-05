package excepciones_ejercicio_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaDeAhorroTest {

	@Test
	public void sacarDineroSinExceptiontest() throws SaldoNegativoException {
		CuentaDeAhorro cuentaAhorro = new CuentaDeAhorro(10.0, "400000");
		assertEquals(10.0, cuentaAhorro.getSaldo());
		cuentaAhorro.retirarSaldo(5.0);
		assertEquals(5.0, cuentaAhorro.getSaldo());
	}
	
	
	@Test
	public void sacarDineroConExceptiontest() throws SaldoNegativoException {
		CuentaDeAhorro cuentaAhorro = new CuentaDeAhorro(10.0, "400000");
		cuentaAhorro.retirarSaldo(11.0);
	}

}
