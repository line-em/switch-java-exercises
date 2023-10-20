package dSoft.Bloco3;

import dSoft.dSoft3;
import org.junit.jupiter.api.Test;
import static dSoft.dSoft3.Ex09.TipoProduto.*;
import static dSoft.dSoft3.Ex09.TipoProduto;
import static dSoft.dSoft3.Ex09.analiseCodigoProduto;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex09Test {
	@Test
	public void codigoProdutoNaoPerecivel() {
		TipoProduto result = analiseCodigoProduto(1);
		assertEquals(ALIMENTO_NAO_PERECIVEL, result);
	}

	@Test
	public void codigoProdutoPerecivel() {
		TipoProduto result = analiseCodigoProduto(3);
		assertEquals(ALIMENTO_PERECIVEL, result);
	}

	@Test
	public void codigoProdutoVestuario() {
		TipoProduto result = analiseCodigoProduto(5);
		assertEquals(VESTUARIO, result);
	}

	@Test
	public void codigoProdutoHigiene() {
		TipoProduto result = analiseCodigoProduto(7);
		assertEquals(HIGIENE_PESSOAL, result);
	}

	@Test
	public void codigoProdutoLimpeza() {
		TipoProduto result = analiseCodigoProduto(10);
		assertEquals(LIMPEZA_E_UTENSILIOS_DOMESTICOS, result);
	}

	@Test
	public void codigoProdutoInvalido() {
		TipoProduto result = analiseCodigoProduto(20);
		assertEquals(CODIGO_INVALIDO, result);
	}
}
