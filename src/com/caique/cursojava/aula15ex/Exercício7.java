package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exerc�cio7 {

	private static Scanner inputNumScanner;
	
	public static void main(String[] args) {
		
		
		 int numeroUm, numeroDois, numeroTres;
	     inputNumScanner = new Scanner(System.in);
	      
	      
	      System.out.println("Insira o primeiro n�mero: ");
	      numeroUm = inputNumScanner.nextInt();
	      
	 
	      System.out.println("Insira o segundo n�mero: ");
	      numeroDois = inputNumScanner.nextInt();
	      
	      System.out.println("Insira o terceiro n�mero: ");
	      numeroTres = inputNumScanner.nextInt();
	      
	      
	      if (numeroUm > numeroDois && numeroUm > numeroTres ||numeroUm > numeroTres && numeroUm > numeroDois ){  
	            System.out.println("o primeiro numero � o maior");
	      }
	      
	      if (numeroDois > numeroUm && numeroDois > numeroTres || numeroDois > numeroTres && numeroDois > numeroUm){  
	            System.out.println("o segundo numero � o maior");
	      }
	      
	      if (numeroTres > numeroUm && numeroTres > numeroDois || numeroTres > numeroDois && numeroTres > numeroUm){  
	            System.out.println("o terceiro numero � o maior");
	      }
	      
	      if (numeroUm < numeroDois && numeroUm < numeroTres ||numeroUm < numeroTres && numeroUm < numeroDois ){  
	            System.out.println("o primeiro numero � o menor");
	      }
	      
	      if (numeroDois < numeroUm && numeroDois < numeroTres || numeroDois < numeroTres && numeroDois < numeroUm){  
	            System.out.println("o segundo numero � o menor");
	      }
	      
	      if (numeroTres < numeroUm && numeroTres < numeroDois || numeroTres < numeroDois && numeroTres < numeroUm){  
	            System.out.println("o terceiro numero � o menor");
	      }
	      
	      if (numeroUm == numeroDois && numeroUm == numeroTres) {  
	    	    System.out.println("Todos os n�meros s�o iguais.");
	      }
	      
	      if (numeroUm == numeroDois && numeroUm != numeroTres) {  
	    	    System.out.println("Primeiro e segundo s�o iguais.");
	      }
	      
	      if (numeroUm == numeroTres && numeroUm != numeroDois) {  
	    	    System.out.println("Primeiro e terceiro s�o iguais.");
	      }
	            

	}

}
