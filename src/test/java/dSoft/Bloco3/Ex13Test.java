package dSoft.Bloco3;

import org.junit.jupiter.api.Test;
import static dSoft.dSoft3.Ex13.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex13Test {
	@Test
	public void verificarQuantidadeInsuficiente() {
		int results = verificarAlimentacaoAdequada(8, 50);
		int expected = -1;
		assertEquals(expected, results);
	}

	@Test
	public void verificarQuantidadeIdeal() {
		int results = verificarAlimentacaoAdequada(8, 100);
		int expected = 0;
		assertEquals(expected, results);
	}

	@Test
	public void verificarQuantidadeSuperior() {
		int results = verificarAlimentacaoAdequada(8, 500);
		int expected = 1;
		assertEquals(expected, results);
	}
	
	@Test
	public void quantidadeIdealPequeno() {
		int results = calculoQuantidadeIdeal(8);
		int expected = 100;
		assertEquals(expected, results);
	}

	@Test
	public void quantidadeIdealMedio() {
		int results = calculoQuantidadeIdeal(20);
		int expected = 250;
		assertEquals(expected, results);
	}

	@Test
	public void quantidadeIdealGrande() {
		int results = calculoQuantidadeIdeal(35);
		int expected = 300;
		assertEquals(expected, results);
	}

	@Test
	public void testCalculoQuantidadeIdeal_PesoMaior45() {
		int results = calculoQuantidadeIdeal(50);
		int expected = 500;
		assertEquals(expected, results);
	}

	@Test
	public void entradaValida() {
		int[] animal1 = new int[]{12, 250};
		int[] animal2 = new int[]{30, 300};
		int[] results = verificarAlimentacaoAdequadaDosAnimais(animal1, animal2);
		int[] expected = new int[]{0, 0};
		assertArrayEquals(expected, results);
	}

	@Test
	public void tamanhoInvalidoArray() {
		int[] results = verificarAlimentacaoAdequadaDosAnimais(new int[]{12, 250, 1});
		int[] expected = new int[]{-1};
		assertArrayEquals(expected, results);
	}

	@Test
	public void pesoNegativo() {
		int[] results = verificarAlimentacaoAdequadaDosAnimais(new int[]{-5, 100});
		int[] expected = new int[]{-2};
		assertArrayEquals(expected, results);
	}

	@Test
	public void alimentacaoInadequada() {
		int[] animal1 = new int[]{12, 100};
		int[] animal2 = new int[]{30, 150};
		int[] results = verificarAlimentacaoAdequadaDosAnimais(animal1, animal2);
		int[] expected = new int[]{-1, -1};
		assertArrayEquals(expected, results);
	}

	@Test
	public void alimentacaoExcessiva() {
		int[] animal1 = new int[]{12, 550};
		int[] animal2 = new int[]{30, 600};
		int[] results = verificarAlimentacaoAdequadaDosAnimais(animal1, animal2);
		int[] expected = new int[]{1, 1};
		assertArrayEquals(expected, results);
	}
}