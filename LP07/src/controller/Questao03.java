package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
		 * apresente a soma de todos os elementos que sejam ímpares.
		 * 
		 */

		
		int a[] = new int [5];
		int soma = 0;
		for(int cont = 0; cont < 5; cont++) {
		
			
			a[cont] = Teclado.lerInt("informe um elemento");
			
			if (a[cont] % 2 == 1) {
				
			soma = soma + a[cont];
			
			}//fim do if
			
			
		}//fim do for
		System.out.println("a soma dos valores inseridos no vetor = " + soma);
		
		
		
		
	}

}
