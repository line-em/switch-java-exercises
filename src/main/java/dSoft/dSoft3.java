package dSoft;

import java.util.Arrays;
import static dSoft.dSoft3.Ex3.EvenOdd.EVEN;
import static dSoft.dSoft3.Ex3.EvenOdd.ODD;
import static dSoft.dSoft3.Ex09.TipoProduto.*;

public class dSoft3 {

	public static class Ex01 {
		public static int calculateAlgorithm(int num) {
			int result = 1;
			for (int i = num; i >= 1; i--) {
				result = result * i;
			}
			return result;
		}
		// d) O resultado é finito. O loop circula até que o valor de X chegue ao valor de 1, e a
		// cada loop, o valor de X é reduzido em 1. Dessa forma, existe uma condição de fim bem
		//	definida, o que impede essa função de gerar um loop infinito.
	}

	public static class Ex2 {
		public static int[] getMultiplesFromInterval(int min, int max, int multiple) {
			if (min < 0 || max < 0 || multiple <= 0) return new int[]{-1};
			if (min >= max) return new int[]{-2};

			int currentPosition = 0;
			int[] multiples = new int[(max - min) / multiple];

			for (int i = min; i < max; i++) {
				if (i % multiple == 0) {
					multiples[currentPosition] = i;
					currentPosition++;
				}
			}
			return multiples;
		}

		public static int[] concatenateTwoArrays(int[] array1, int[] array2) {
			if (array1.length == 0 || array2.length == 0) return new int[]{-1};

			int[] concatArray = new int[array1.length + array2.length];

			System.arraycopy(array1, 0, concatArray, 0, array1.length);
			System.arraycopy(array2, 0, concatArray, array1.length, array2.length);

			return concatArray;
		}

		public static int[] getMultiplesOfTwoNumbersFromInterval(int min, int max, int multiple1,
																					int multiple2) {
			if (min < 0 || max < 0 || multiple1 <= 0 || multiple2 <= 0) return new int[]{-1};
			if (min >= max) return new int[]{-2};

			int[] multiples1 = getMultiplesFromInterval(min, max, multiple1);
			int[] multiples2 = getMultiplesFromInterval(min, max, multiple2);

			int[] allMultiples = concatenateTwoArrays(multiples1, multiples2);
			return allMultiples;
		}

		public static int sumOfMultiples(int[]... arrays) {
			int totalSum = 0;
			for (int[] array : arrays) {
				for (int value : array) {
					totalSum += value;
				}
			}
			return totalSum;
		}
	}

	public static class Ex3 {
		public enum EvenOdd {
			EVEN, ODD
		}

		public static EvenOdd verifyEvenOdd(int num) {
			return num % 2 == 0 ? EVEN : ODD;
		}

		public static int sumOfEvenNumbers(int min, int max, EvenOdd evenOdd) {
			// generate array from min, max.
			// use for loop to check with verifyEvenOdd
			// push the new values to a new variable, totalSum += num
			return 0;
		}

	}

	public static class Ex06 {
		final static double bonusPercentage = 2;

		public static double getHourlyBonus(double baseSalary, int extraHours) {
			double hourlyBonus = (baseSalary * bonusPercentage) / 100;
			double totalBonus = extraHours * hourlyBonus;
			if (totalBonus < 0) return -2;
			return totalBonus;
		}

		public static double getMonthlyWage(double baseSalary, int extraHours) {
			if (baseSalary <= 0) return -1;

			double bonus = getHourlyBonus(baseSalary, extraHours);
			if (bonus < 0) return bonus;

			double monthlyWage = baseSalary + bonus;
			return monthlyWage;
		}
	}

	public static class Ex07 {
		public static int getPositionProductIsHigherThanNum(int[] numArray, int num) {
			int total = 1;

			for (int i = 0; i < numArray.length; i++) {
				if (numArray[i] < 0) return -1;
				total *= numArray[i];
				if (total > num) return i;
			}

			return -2;
		}
	}

	public static class Ex09 {
		public enum TipoProduto {
			ALIMENTO_NAO_PERECIVEL, ALIMENTO_PERECIVEL, VESTUARIO, HIGIENE_PESSOAL,
			LIMPEZA_E_UTENSILIOS_DOMESTICOS, CODIGO_INVALIDO
		}

		public static TipoProduto analiseCodigoProduto(int codigo) {
			return switch (codigo) {
				case 1 -> ALIMENTO_NAO_PERECIVEL;
				case 2, 3, 4 -> ALIMENTO_PERECIVEL;
				case 5, 6 -> VESTUARIO;
				case 7 -> HIGIENE_PESSOAL;
				case 8, 9, 10, 11, 12, 13, 14, 15 -> LIMPEZA_E_UTENSILIOS_DOMESTICOS;
				default -> CODIGO_INVALIDO;
			};
		}
	}

	public static class Ex10 {
		public enum Moedas {
			DOLAR, D, LIBRA, L, IENE, I, COROA_SUECA, C, FRANCO_SUICO, F
		}

		public static double obterCambio(Moedas moeda) {
			return switch (moeda) {
				case DOLAR, D -> 1.534;
				case LIBRA, L -> 0.774;
				case IENE, I -> 161.480;
				case COROA_SUECA, C -> 9.593;
				case FRANCO_SUICO, F -> 1.601;
			};
		}
	}

	public static class Ex12salaryTaxes {
		public static double getSalaryTaxes(double salary) {
			if (salary <= 0) return -1;
			if (salary < 500) return 0.10;
			if (salary >= 500 && salary < 1000) return 0.15;
			else return 0.20;
		}

		public static double getNetSalary(double salary) {
			if (salary <= 0) return -1;
			double taxPercentage = getSalaryTaxes(salary);
			if (taxPercentage <= 0) return taxPercentage;
			return salary - (salary * taxPercentage);
		}
	}

	public static class Ex13 {
		// A)
		public static int verificarAlimentacaoAdequada(double peso, double comidaDiariaGramas) {
			int quantidadeIdeal = calculoQuantidadeIdeal(peso);
			boolean alimentacaoAdequada = comidaDiariaGramas == quantidadeIdeal;
			boolean alimentacaoInsuficiente = comidaDiariaGramas < quantidadeIdeal;

			if (alimentacaoAdequada) return 0;
			if (alimentacaoInsuficiente) return -1;
			else return 1;
		}

		public static int calculoQuantidadeIdeal(double peso) {
			if (peso <= 10) return 100;
			if (peso > 10 && peso <= 25) return 250;
			if (peso > 25 && peso <= 45) return 300;
			else return 500;
		}

		// B)
		public static int[] verificarAlimentacaoAdequadaDosAnimais(int[]... animais) {
			int[] alimentacaoDosAnimais = new int[animais.length];
			int posicaoAtual = 0;
			for (int[] animal : animais) {
				if (animal.length != 2) return new int[]{-1}; // Array de tamanho inválido.

				int peso = animal[0];
				int comida = animal[1];
				if (peso <= 0) return new int[]{-2}; // Peso inválido

				alimentacaoDosAnimais[posicaoAtual] = verificarAlimentacaoAdequada(peso, comida);
				posicaoAtual++;
			}
			return alimentacaoDosAnimais;
		}
	}
}
