package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício7 {

	private static Scanner inputNumScanner;
	
	public static void main(String[] args) {
		
		
		 int numeroUm, numeroDois, numeroTres;
	     inputNumScanner = new Scanner(System.in);
	      
	      
	      System.out.println("Insira o primeiro número: ");
	      numeroUm = inputNumScanner.nextInt();
	      
	 
	      System.out.println("Insira o segundo número: ");
	      numeroDois = inputNumScanner.nextInt();
	      
	      System.out.println("Insira o terceiro número: ");
	      numeroTres = inputNumScanner.nextInt();
	      
	      
	      if (numeroUm > numeroDois && numeroUm > numeroTres ||numeroUm > numeroTres && numeroUm > numeroDois ){  
	            System.out.println("o primeiro numero é o maior");
	      }
	      
	      if (numeroDois > numeroUm && numeroDois > numeroTres || numeroDois > numeroTres && numeroDois > numeroUm){  
	            System.out.println("o segundo numero é o maior");
	      }
	      
	      if (numeroTres > numeroUm && numeroTres > numeroDois || numeroTres > numeroDois && numeroTres > numeroUm){  
	            System.out.println("o terceiro numero é o maior");
	      }
	      
	      if (numeroUm < numeroDois && numeroUm < numeroTres ||numeroUm < numeroTres && numeroUm < numeroDois ){  
	            System.out.println("o primeiro numero é o menor");
	      }
	      
	      if (numeroDois < numeroUm && numeroDois < numeroTres || numeroDois < numeroTres && numeroDois < numeroUm){  
	            System.out.println("o segundo numero é o menor");
	      }
	      
	      if (numeroTres < numeroUm && numeroTres < numeroDois || numeroTres < numeroDois && numeroTres < numeroUm){  
	            System.out.println("o terceiro numero é o menor");
	      }
	      
	      if (numeroUm == numeroDois && numeroUm == numeroTres) {  
	    	    System.out.println("Todos os números são iguais.");
	      }
	      
	      if (numeroUm == numeroDois && numeroUm != numeroTres) {  
	    	    System.out.println("Primeiro e segundo são iguais.");
	      }
	      
	      if (numeroUm == numeroTres && numeroUm != numeroDois) {  
	    	    System.out.println("Primeiro e terceiro são iguais.");
	      }
	            

	}

}
