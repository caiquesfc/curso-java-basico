package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exerc�cio4 {

	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		 double soma = 0;
		 double media = 0, numeroUm, numeroDois, numeroTres, numeroQuatro;
		 double resultado = media;
	     inputNumScanner = new Scanner(System.in);
	     
	     
	     System.out.println("Insira o primeiro n�mero: ");
	      numeroUm = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o segundo n�mero: ");
	      numeroDois = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o terceiro n�mero: ");
	      numeroTres = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o quarto n�mero: ");
	      numeroQuatro = inputNumScanner.nextDouble();
	      
	      soma = numeroUm + numeroDois + numeroTres + numeroQuatro;
	      media = soma / 4;
	      resultado = media;
	      
	      System.out.println("A m�dia � = " + resultado);
	     
	     

	}

}
