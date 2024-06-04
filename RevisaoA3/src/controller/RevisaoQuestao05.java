package controller;

public class RevisaoQuestao05 {

	public static void main(String[] args) {
		/*
		 * 5. Fazer um algoritmo com do..while que exiba o valor da soma dos números
		 * pares que existem no intervalo de 0 a 50.
		 */

		
		int cont, acumulador;
		
		cont = 0;
		acumulador = 0;
		do {
			//cont = cont +2; è usado para contar numeros pares
			//cont ++ ; conta de 1 em 1 
			//cont = cont +1; é usado para contar numeros impares
			acumulador = acumulador + cont;
			cont = cont+2; //sempre usar no do while
		}while (cont <= 50 );
		
		System.out.println("a soma dos valores pares de 0 a 50 é " + acumulador);
		
		
		
	}

}