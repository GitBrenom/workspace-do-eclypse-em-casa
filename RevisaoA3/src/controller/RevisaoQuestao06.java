package controller;

import util.Teclado;

public class RevisaoQuestao06 {

	public static void main(String[] args) {

		
		/*
		 * 6. Fazer um algoritmo com while que pergunte a idade de 10 pessoas, e ao final, informe quantas destas pessoas são menores de idade.
		 */
		
		
		int id , cont, menorId = 0 ;
		
		cont = 1; //porque tem que ir de 1 ate 10
		
		while ( cont <=10) { // para perguntar a idade da pessoa de 10 vezes
		
			id = Teclado.lerInt("informe a idade da pessoa " + cont);
			if (id <18 ) {
				menorId++;
			}
			
			
			cont++; 
		}
		System.out.println(menorId + " pessoas sao menores de idade");

	}

}
