package controller;

import util.Teclado;

public class A1teste8 {

	public static void main(String[] args) {
		
		
		
		
		double quantidadeNotas, nota, soma = 0, media, cont = 1;

		quantidadeNotas = Teclado.lerDouble("Digite a quantidade de notas: ");

		while (cont <= quantidadeNotas) {
		    nota = Teclado.lerDouble("Digite a nota " + cont + ": ");
		    soma = soma + nota;// Corrigindo a linha que calcula a soma das notas
		    cont++;
		}//fim do while

		media = soma / quantidadeNotas;

		System.out.println("A média aritmética das notas inseridas é: " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
