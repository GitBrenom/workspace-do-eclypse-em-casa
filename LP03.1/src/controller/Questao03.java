package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
	/*
	 * 3) Fazer um programa que pergunte um valor em Dólares e apresente o equivalente em Reais. Considere U$1,00 =
R$3,80
	 */

		
		double dolar, real;
		
		dolar = Teclado.lerDouble("informe um numero de dolares");
		
		real = dolar * 3.80;
		
		System.out.println("esse valor de dolares em real é " + real);
		
		
		
	}

}
