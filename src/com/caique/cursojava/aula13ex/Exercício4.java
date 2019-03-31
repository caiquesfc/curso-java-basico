package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício4 {

	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		 double soma = 0;
		 double media = 0, numeroUm, numeroDois, numeroTres, numeroQuatro;
		 double resultado = media;
	     inputNumScanner = new Scanner(System.in);
	     
	     
	     System.out.println("Insira o primeiro número: ");
	      numeroUm = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o segundo número: ");
	      numeroDois = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o terceiro número: ");
	      numeroTres = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o quarto número: ");
	      numeroQuatro = inputNumScanner.nextDouble();
	      
	      soma = numeroUm + numeroDois + numeroTres + numeroQuatro;
	      media = soma / 4;
	      resultado = media;
	      
	      System.out.println("A média é = " + resultado);
	     
	     

	}

}
