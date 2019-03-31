package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício13 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		double valorHora;
        double horasTrabalhadas;
        double valorMes;
        double ir; 
        double inss;
        double sindicato;
        double salarioLiquido;
        
        System.out.println("Digite quanto você ganha por hora: ");
        scan = new Scanner(System.in);
		valorHora = scan.nextDouble();
	
        	
		System.out.println("Digite o número de horas trabalhadas no mês: ");
        scan = new Scanner(System.in);
		horasTrabalhadas = scan.nextDouble();
		
		
		valorMes = (valorHora * horasTrabalhadas);
		System.out.println("Seu salário no mês é: " + valorMes);
		
		
		ir = valorMes * 0.11;
		inss = valorMes * 0.08;
		sindicato = valorMes * 0.05;
	    salarioLiquido = valorMes - ir - inss - sindicato;
	    
	    System.out.println("O valor o Imposto de renda é: " + ir);
	    System.out.println("O valor do INSS é: " + inss);
	    System.out.println("O valor do sindicato é: " + sindicato);
	    System.out.println("O valor do salario liquido é: " + salarioLiquido);
	
	
	}
	

}
