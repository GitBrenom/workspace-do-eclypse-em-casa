package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte 5 valores do vetor a, e em seguida crie
		 * um vetor b de mesma dimensão contendo os valores ao quadrado correspondentes
		 * no vetor a. Ao final exibir os 2 vetores.
		 */

		
		
		
		
		double a[] = new double[5];
		double b[] = new double[5];
		
		for (int cont = 0; cont < 5; cont++) {
			
			a[cont] = Teclado.lerInt("informe um valor para o vetor a" );
			b[cont] = Math.pow(a[cont], 2);
		}//fim do for
		System.out.println("\n ------ vetor a ------------");
		
		for (int cont = 0; cont < 5; cont++) {
			
			System.out.print( a[cont] + " ");
			
		}//fim do for
		System.out.println("\n ------ vetor b ------------");
		
	for (int cont = 0; cont < 5; cont++) {
			
			System.out.print( b[cont] + " ");
			
		}//fim do for
		
		
		
	}

}
