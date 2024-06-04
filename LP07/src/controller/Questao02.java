package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
		 * apresente a soma de todos os elementos deste vetor.
		 */

		
		int a[] = new int [5];
		int acum = 0;
		
		for(int cont = 0; cont < 5; cont++) {
			
			a[cont] = Teclado.lerInt("informe um elemento");
			acum = acum + a[cont];
			
		}//fim do for
		
		
			
			System.out.println("soma dos valores inseridos " +  acum);
		}
		
		
	

}
