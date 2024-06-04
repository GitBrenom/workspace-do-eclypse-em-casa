package controller;

import util.Teclado;

public class RevisaoQuestao03 {

	public static void main(String[] args) {
		/*
		 * 3. Fazer um algoritmo que peça um número, e ao final, informe se o número
		 * está 
		 * abaixo de 1000, 
		 * entre 1000 e 5000, 
		 * entre 5001 e 8000, 
		 * ou acima de 8000.
		 */

		// O COMANDO CNTRL SHIFT F ENDIREITA AS CHAVES E O PROGRAMA !!!!!!!!!!!!!!!!!!!!!!!!
		
		int num;

		num = Teclado.lerInt("informe um número inteiro");

		if (num < 1000) {
			System.out.println(num + " está abaixo de 1000");

		} else {
			if (num <= 5000) {
				System.out.println(num + " está entre 1000 e 5000");

			} else {
				if (num <= 8000) {
					System.out.println(num + " está entre 5001 e 8000");
				}else {
					System.out.println(num + " stá acima de 8000");
				// Para usar if else if else precisa colocar o fim da chave do else e só dps colocar o novo comando do if 
				}
				
			}

		}

	}

}


