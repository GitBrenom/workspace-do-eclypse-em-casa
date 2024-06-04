package controller;

import util.Teclado;

public class RevisaoQuestao04 {

	public static void main(String[] args) {
		/*
		 * 4. Fazer um algoritmo que peça um número de 1 a 7, e ao final, informe o dia
		 * da semana (por extenso) correspondente ao número que foi inserido.
		 * 
		 */

		
		
		int  dia;
		
		dia = Teclado.lerInt("Informe um numero correspondente a um dia da semana");
		
		
		switch (dia) {
		
		case 1 : 
			System.out.println("domingo");
			break;
		case 2 : 
			System.out.println("Segunda-Feira");
			break;
		case 3 : 
			System.out.println("Terça-Feira");
			break;
		case 4 : 
			System.out.println("Quarta-Feira");
			break;
		case 5 : 
			System.out.println("Quinta-Feira");
			break;
		case 6 : 
			System.out.println("Sexta-Feira");
			break;
		case 7 : 
			System.out.println("Sabado");
			break;
			
			default:
				System.out.println("Não corresponde a um dia da semana");
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}