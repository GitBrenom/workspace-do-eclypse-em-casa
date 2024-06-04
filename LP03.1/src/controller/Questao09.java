package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		/*
		 * 9) Fazer um algoritmo que pergunte 1 número e apresente:
		 * a) O próprio número
b) O quadrado deste número
c) A raiz quadrada deste número
		 */

		
		
		
		
		
		double num, quadrado, raiz;
		
		num = Teclado.lerDouble("informe um número");
		
		quadrado = Math.pow(num, 2);
		
		
		raiz = Math.sqrt(num);
		
		System.out.println("o número que voce escolheu foi " + num + " Esse numero elevado ao quadrado é " + quadrado + " a raiz desse numero é " + raiz);
		
		
		
		
		
	}

}
