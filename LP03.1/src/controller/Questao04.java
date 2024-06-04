package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		/*
		 * 4) Fazer um programa que pergunte um número inteiro e apresente o seu antecessor e seu sucessor
		 */

		
		
		int num, antecessor, sucessor; 
		
		num = Teclado.lerInt("informe um número");
		
		antecessor = num - 1;
	    sucessor = num + 1;
		
	    
	    System.out.println("O antecessor do número escolhido é " + antecessor + " o sucessor do número escolhido é " + sucessor );
		
		
		
		
		
		
		
		
		
		
		
	}

}
