package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		/*
		 * 8) Fazer um programa que calcule e apresente a quantidade de litros que um automóvel gastará em uma viagem. O
           programa deve coletar as seguintes informações: Distância a percorrer na viagem, em quilômetros; qual é o
           valor do consumo médio do automóvel, em quilômetros por litro.
		 */
	
	
	double litros, distancia, consumoM;
	
	
	
	distancia = Teclado.lerDouble("Porfavor informe a distancia da viagem em Km: ");
	consumoM = Teclado.lerDouble("Porfavor Informe o consumo médio do automovel em Km por litro");
	
	
	litros =  distancia / consumoM;
	
	
	
	System.out.println("O valor de consumo médio de litros de gasolina nesta viagem sera de " + litros + "litros de combustivel");
	
	
	
	}

}
