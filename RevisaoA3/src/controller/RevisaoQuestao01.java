package controller;

import util.Teclado;

public class RevisaoQuestao01 {

	public static void main(String[] args) {
		/*
		 * 1. Fazer um algoritmo que pergunte um valor e 
		 * exiba como resposta este valor com acréscimo de 18% e também o mesmo valor inicial com desconto de 65%.
		 */

		
		double valor1, valor2, valor3;
		
		
		valor1 = Teclado.lerDouble("Informe um valor");
		
		valor2 = valor1 * 1.18;
		
		valor3 =  (valor1 * 65/100);
		
		System.out.println("o valor com acrescimo de 18% é: " + valor2 + "o valor com decrescimo de 65% é : " + valor3);
		
		
		
		
		
		
		
		
	}

}