package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exerc�cio8 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		double valorHora;
        double horasTrabalhadas;
        double valorMes;
 
        System.out.println("Informe o valor que voc� ganha a hora: ");
        scan = new Scanner(System.in);
		valorHora = (double) scan.nextDouble();
		
        System.out.println("Informe as horas trabalhadas no m�s: ");
        scan = new Scanner(System.in);
		horasTrabalhadas = (double) scan.nextDouble();
 
        valorMes = (valorHora * horasTrabalhadas);
 
        System.out.println("O valor do sal�rio no m�s � de: " + valorMes);

	}

}
