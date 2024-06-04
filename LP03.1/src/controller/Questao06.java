package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		/*
		 * 6) Fazer um programa que pergunte uma temperatura ao usuário, em graus Fahrenheit, e apresente esta
temperatura convertida em graus Celsius. A fórmula da conversão é c	=	(f	–	32)	.	5	÷	9	, onde c	 é a temperatura
em graus Celsius e f		em Fahrenheit.
		 */
		
		
		
		
		double f, c;
		
		
		f = Teclado.lerDouble("informe a temperatura em fahrenheit : ");
		
		c = (f - 32 ) * 5 / 9; 
		
		System.out.println("Essa temperatura de fahrenheit em celsius é " + c);
		
		
		
		
		
		
		

	}

}
