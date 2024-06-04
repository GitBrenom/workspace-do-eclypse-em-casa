package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		/*
		 * 7) Fazer um algoritmo que pergunte 3 números e apresente a média aritmética entre estes 3 números
		 */

		
		double n1, n2, n3, media;
		
		n1 = Teclado.lerDouble("informe um número: ");
		n2 = Teclado.lerDouble("informe outro número: "); 
		n3 = Teclado.lerDouble("informe outro número: ");
		
		media = (n1 + n2 + n3) / 3;
		
		
		System.out.println("A média dos valores escolhidos é : " + media);
		
		
		
		
		
		
		
		
		
		
	}

}
