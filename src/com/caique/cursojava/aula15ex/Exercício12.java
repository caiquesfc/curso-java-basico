package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício12 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		double valorHora;
        double horasTrabalhadas;
        double valorMes;
        double ir; 
        double inss;
        double fgts;
        double salarioLiquido;
        double descontos;
        
        System.out.println("Digite quanto você ganha por hora: ");
        scan = new Scanner(System.in);
		valorHora = scan.nextDouble();
	
        	
		System.out.println("Digite o número de horas trabalhadas no mês: ");
        scan = new Scanner(System.in);
		horasTrabalhadas = scan.nextDouble();
		
		
		valorMes = (valorHora * horasTrabalhadas);
		
		
		if (valorMes <= 900) {
			
			ir = 0;
			inss = valorMes * 0.10;
			fgts = valorMes * 0.11;
			descontos = ir + inss;
		    salarioLiquido = valorMes - ir - inss;
		    
		    System.out.println("Seu salário no mês é: " + valorMes);
		    System.out.println("O valor do Imposto de renda é: " + ir);
		    System.out.println("O valor do INSS é: " + inss);
		    System.out.println("O valor do fgts é: " + fgts);
		    System.out.println("O valor dos descontos é: " + descontos);
		    System.out.println("O valor do salario liquido é: " + salarioLiquido);
		    
		    
		    }else if (valorMes >= 900 && valorMes <= 1500) {
				
				ir = valorMes * 0.05;
				inss = valorMes * 0.10;
				fgts = valorMes * 0.11;
				descontos = ir + inss;
			    salarioLiquido = valorMes - ir - inss;
			    
			    System.out.println("Seu salário no mês é: " + valorMes);
			    System.out.println("O valor do Imposto de renda é: " + ir);
			    System.out.println("O valor do INSS é: " + inss);
			    System.out.println("O valor do fgts é: " + fgts);
			    System.out.println("O valor dos descontos é: " + descontos);
			    System.out.println("O valor do salario liquido é: " + salarioLiquido);
			    
			    
             }else if (valorMes > 1500 && valorMes <= 2500) {
  				
				ir = valorMes * 0.10;
				inss = valorMes * 0.10;
				fgts = valorMes * 0.11;
				descontos = ir + inss;
			    salarioLiquido = valorMes - ir - inss;
			    
			    System.out.println("Seu salário no mês é: " + valorMes);
			    System.out.println("O valor do Imposto de renda é: " + ir);
			    System.out.println("O valor do INSS é: " + inss);
			    System.out.println("O valor do fgts é: " + fgts);
			    System.out.println("O valor dos descontos é: " + descontos);
			    System.out.println("O valor do salario liquido é: " + salarioLiquido);
			    
			    
             }else if (valorMes > 2500) {
 				
 				ir = valorMes * 0.20;
 				inss = valorMes * 0.10;
 				fgts = valorMes * 0.11;
 				descontos = ir + inss;
 			    salarioLiquido = valorMes - ir - inss;
 			    
 			    System.out.println("Seu salário no mês é: " + valorMes);
 			    System.out.println("O valor do Imposto de renda é: " + ir);
 			    System.out.println("O valor do INSS é: " + inss);
 			    System.out.println("O valor do fgts é: " + fgts);
 			    System.out.println("O valor dos descontos é: " + descontos);
 			    System.out.println("O valor do salario liquido é: " + salarioLiquido);
			    
			    
			    
		    
		    
		    
		}
		
	

	}

}
