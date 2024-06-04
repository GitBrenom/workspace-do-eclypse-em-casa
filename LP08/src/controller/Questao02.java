package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * 2) Desenvolver um programa que crie uma matriz com 3 linhas e 2 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz, e ao final exiba a
	 * matriz inteira e também a soma dos números desta matriz.
	 */

	public static void main(String[] args) {

		int mat[][] = new int[3][2];
		int soma = 0; // soma é var acumulador

		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 2; col++) {
				mat[lin][col] = Teclado.lerInt("[" + lin + "][" + col + "]: Número?");
				soma = soma + mat[lin][col];
			} // fim do for col
		} // fim do for lin

		System.out.println("--- Exibindo a matriz inteira ---");
		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 2; col++) {
				System.out.print(mat[lin][col] + " ");
			} // fim do for col
			System.out.println();// pular linha
		} // fim do for lin

		System.out.println("A soma dos valores da matriz é " + soma);
	}

}