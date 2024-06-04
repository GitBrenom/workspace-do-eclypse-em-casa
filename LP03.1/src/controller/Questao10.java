package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo que efetue o cálculo do valor de uma prestação em atraso, utilizando a fórmula 
		 * prestação em atraso 	=	valor	+	(valor	.	(taxa	:	100)	.	tempo	em	dias).
		 */

		double prestaçãoAtrasada, prestaçãoInicial, taxa, diaAtrasado;
		
		prestaçãoInicial = Teclado.lerDouble("Porfavor informe o valor da prestação inicial: " );
		
		taxa = Teclado.lerDouble("Porfavor informe o valor da taxa em % : " );
		
		diaAtrasado =  Teclado.lerDouble("Porfavor informe quantos dias atrasou: ");
		
		prestaçãoAtrasada = prestaçãoInicial + (prestaçãoInicial * (taxa / 100) * diaAtrasado);
		
		System.out.println("O preço da prestação em atraso é de : " + prestaçãoAtrasada);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
