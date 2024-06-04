package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
	
		
		/*
		 * 2) Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:
a) Resultado de suas adições
b) Resultado de suas multiplicações
		 */
		
		
		
		int num1, num2, num3, num4, soma, multi;
		
		
		num1 = Teclado.lerInt("informe um número");
		num2 = Teclado.lerInt("informe outro número");
		num3 = Teclado.lerInt("informe outro numero");
		num4 = Teclado.lerInt("informe outro numero");
		
		soma = num1 + num2 + num3 + num4;
		multi = num1 * num2 * num3 * num4;
		System.out.println("a soma dos numeros é " + soma + " a multiplicação dos numeros é " + multi );
		
		
		
		
		

	}

}
