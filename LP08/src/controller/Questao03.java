package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		
		/*
		 * ) Desenvolver um programa que crie uma matriz de 4 linhas e 3 colunas. Pergunte ao usuário números para
			preencher toda a matriz, e ao final, exiba a matriz inteira e a soma dos números pares contidos na matriz.

		 */
		
			int mat[][] = new int [4][3]; //numero 4 sao as linhas e o numero 3 as colunas
			int somaPares = 0; // var acumuladora
			
			for (int lin = 0; lin <4; lin++) {// coloca simbolo de menor e o numero da linha
				
			for (int col = 0; col <3; col++) {
				
			mat [lin][col] = Teclado.lerInt("["+lin+"]"+col+"[] - numero?"); //faça nesse esquema para informar numero da linha  e coluna ao usuario
			
			
			if (mat[lin][col]% 2 == 0) { //se o numero divido por 2 der 0  ele fara guardara o resultado no somapares ou seja ele pega os numeros pares somente pois só numeros pares dao 0 ao dividir
				somaPares = somaPares + mat[lin][col];
			}
			
			}//fim do col de coluna
			
			}//fim do lin de linha
			
			System.out.println("exibindo toda a matriz");
			
			//necessario escrrever todo o for novamente copiando e colando porem trocando a linha do teclado pela do sysout
			
			for (int lin = 0; lin <4; lin++) {// coloca simbolo de menor e o numero da linha
				
				for (int col = 0; col <3; col++) {
					
		System.out.print(mat[lin][col] + " "); //para mostrar matriz e pular linha 1
				
				}//fim do col de coluna
				System.out.println(" "); //para pular linha parte 2
				}//fim do lin de linha
			
		
		System.out.println("a soma dos numeros pares é " + somaPares);
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}