package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {

		/*
		 * Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte
		 * ao usuário o nome e a profissão de 5 pessoas e preencha estes vetores. Ao
		 * final exiba um relatório apontando o nome e a profissão de cada uma das 5
		 * pessoas cadastradas.
		 */

		
		String nome[] = new String[5];
		String profissao[] = new String[5];
		
		for (int cont = 0; cont < 5; cont++) {
		
		nome[cont] = Teclado.lerTexto("informe o nome do funcionario:");
		profissao[cont] = Teclado.lerTexto("informe a profissao do funcionario:" );
		
			
		}//fim do for
		
		for (int cont = 0; cont < 5; cont++) {
			
			System.out.println("nome: " + nome[cont] + "-profissaao:" + profissao[cont]);
			
		}//fim do for 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
