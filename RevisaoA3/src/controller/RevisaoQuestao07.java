package controller;

import util.Teclado;

public class RevisaoQuestao07 {

	public static void main(String[] args) {
		/*
		 * 7. Fazer um algoritmo com for que pergunte um número positivo, e exiba na
		 * tela a lista de números de 1 até o número informado.
		 * 
		 */

		
		int num;
		
		num = Teclado.lerInt("Informe um numero positivo: ");
		
		for (int cont = 1 ; cont <= num; cont++) {
			System.out.println(cont);
		}
		
		
		
		
	}
	
}