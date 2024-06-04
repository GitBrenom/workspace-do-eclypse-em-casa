package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		/*
		 * 5) Fazer um programa que pergunte o salário de um funcionário e apresente este salário com um aumento de 15%.
		 */

		
		double salario, salarioMaior;
		
	salario = Teclado.lerDouble("Informe porfavor seu salario: " ); 
	
	//salarioMaior = salario * 1.15 ; (forma alternativa de fazer o calculo  de porcentagem ) 
	salarioMaior = salario + (salario * 15 / 100);
		
		
	System.out.println(" O salario com reajuste de 15% é : " + salarioMaior); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
