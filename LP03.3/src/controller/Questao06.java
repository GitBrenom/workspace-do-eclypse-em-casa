package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo que pergunte dois valores a e b, efetue a troca dos
		 * valores, de forma que a variável a passe a possuir o valor da variável b, e
		 * que a variável b passe a possuir o valor da variável a, e apresente os
		 * valores trocados.
		 */

		
		
		int a, b, aux;
		
		a	=	Teclado.lerInt("informe valor de a");
		b	=	Teclado.lerInt("informe valor de b");
		aux	=	a;
		a	=	b;
		b	=	aux;
		System.out.println("valor de a: " + a);
		
		System.out.println("valor de b : " + b);
		
		
		
		
	}

}
