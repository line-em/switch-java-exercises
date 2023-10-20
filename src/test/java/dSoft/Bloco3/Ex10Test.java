package dSoft.Bloco3;

import dSoft.dSoft3;
import org.junit.jupiter.api.Test;
import static dSoft.dSoft3.Ex10.Moedas.*;
import static dSoft.dSoft3.Ex10.obterCambio;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex10Test {
	@Test
	public void cambioDolar() {
		double expected = 1.534;
		assertEquals(expected, obterCambio(DOLAR));
	}

	@Test
	public void cambioLibra() {
		double expected = 0.774;
		assertEquals(expected, obterCambio(L));
	}

	@Test
	public void cambioIene() {
		double expected = 161.480;
		assertEquals(expected, obterCambio(IENE));
	}

	@Test
	public void cambioCoroaSueca() {
		double expected = 9.593;
		assertEquals(expected, obterCambio(C));
	}

	@Test
	public void cambioFrancoSuico() {
		double expected = 1.601;
		assertEquals(expected, obterCambio(FRANCO_SUICO));
	}
}
