package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
	
		
		
		/*
		 * 1) Desenvolver um programa que pergunte ao usuário o seu nome completo e seu sexo. Em seguida, o programa
deve apresentar os dados anteriormente informados.
		 */
		
	String nome, sexo;	
		
	nome = Teclado.lerTexto("Qual seu nome completo");
	sexo = Teclado.lerTexto("Informe seu sexo");
		
		System.out.println(" Seu nome é " + nome + " seu sexo é " + sexo);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
