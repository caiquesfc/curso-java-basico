package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício8 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		double valorHora;
        double horasTrabalhadas;
        double valorMes;
 
        System.out.println("Informe o valor que você ganha a hora: ");
        scan = new Scanner(System.in);
		valorHora = (double) scan.nextDouble();
		
        System.out.println("Informe as horas trabalhadas no mês: ");
        scan = new Scanner(System.in);
		horasTrabalhadas = (double) scan.nextDouble();
 
        valorMes = (valorHora * horasTrabalhadas);
 
        System.out.println("O valor do salário no mês é de: " + valorMes);

	}

}
