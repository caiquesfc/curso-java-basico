package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício11 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		double salario;
		double aumento;	
		double novoSalario;
		
		System.out.println("Digite o seu salário: ");
		scan = new Scanner(System.in); 
		salario = scan.nextDouble();
		
		if (salario <= 280) {
		aumento = (salario * 20) / 100;
		novoSalario = salario + aumento;
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percentual de aumento aplicado: " + 20);
		System.out.println("Valor do aumento: " + aumento);
		System.out.println("Novo salário após o aumento: " + novoSalario);	
		
		}else if (salario > 280.00 && salario <= 700.00) {
		aumento = (salario * 15) / 100;
		novoSalario = salario + aumento;
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percentual de aumento aplicado: " + 15);
		System.out.println("Valor do aumento: " + aumento);
		System.out.println("Novo salário após o aumento: " + novoSalario);
		
		}else if (salario > 700.00 && salario <= 1500.00) {
		aumento = (salario * 10) / 100;
		novoSalario = salario + aumento;
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percentual de aumento aplicado: " + 10);
		System.out.println("Valor do aumento: " + aumento);
		System.out.println("Novo salário após o aumento: " + novoSalario);
		
			
		}else if (salario > 1500.00) {
		aumento = (salario * 5) / 100;
		novoSalario = salario + aumento;
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percentual de aumento aplicado: " + 5);
		System.out.println("Valor do aumento: " + aumento);
		System.out.println("Novo salário após o aumento: " + novoSalario);
		
						
		
			
		}
		
		
		
		

	}

}
