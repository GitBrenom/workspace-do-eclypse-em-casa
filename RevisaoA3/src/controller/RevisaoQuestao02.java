package controller;

import util.Teclado;

public class RevisaoQuestao02 {

	public static void main(String[] args) {
		/*
		 * 2. Fazer um algoritmo que peça um número de 3 dígitos, e ao final, o exiba de forma invertida. (Exemplo: 
		 * Se o usuário digitar o número 123, deverá ser exibido como resposta o número 321).
		 *  Não vale criar 3 variáveis e apresentar a resposta invertendo a ordem delas. A resposta tem que estar em uma única variável.
		 */

		int num, aux, centena, dezena, unidade, invertida;
		
		num = Teclado.lerInt("informe um número inteiro de 3 digitos: ");
		
		if (num >= 100 && num <= 999) {
			
			aux = num % 100;
			centena = (num - aux ) / 100;
			dezena = aux / 10;
			unidade = aux - (dezena * 10 ); // outra forma de fazer: aux % 10 
			invertida	= (unidade * 100) + (dezena *10 ) + (centena * 1 );
			System.out.println(num + "invertido é " + invertida);
			
		}else {
			System.out.println("O numero informado não possui  3 digitos");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}