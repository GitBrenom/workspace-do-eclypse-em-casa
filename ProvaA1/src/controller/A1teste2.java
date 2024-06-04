package controller;

import util.Teclado;

public class A1teste2 {

	public static void main(String[] args) {
		
		int numero, pares = 0, impares = 0, multiplosDe5 = 0;

        numero = Teclado.lerInt("Insira um número inteiro positivo  (use um valor negativo como sinal de parada) : ");

        while (numero >= 0) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero % 5 == 0) {
                multiplosDe5++;
            }

            numero = Teclado.lerInt("Insira um número inteiro positivo  (use um valor negativo como sinal de parada) : ");
        }

        System.out.println("\nResultados:");
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        System.out.println("Múltiplos de 5: " + multiplosDe5);

	}

}
