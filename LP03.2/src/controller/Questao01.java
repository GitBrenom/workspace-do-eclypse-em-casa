package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		/*
		 * 1) Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante e exiba como resposta o
           valor com o acréscimo dos 10% da gorjeta do garçom.
		 */

		
		
		
		double conta, contaGorjeta;
		
		
		conta = Teclado.lerDouble("Informe o valor da conta a ser paga:");
		
		contaGorjeta = conta + (conta * 10 / 100) ;
		
		
		
		System.out.println("O valor a ser pago com gorjeta inclusa é de " + contaGorjeta);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
