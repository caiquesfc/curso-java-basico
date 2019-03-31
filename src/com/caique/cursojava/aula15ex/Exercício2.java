package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício2 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);	
		
		System.out.println("Digite um valor: ");
	    int valor = scan.nextInt();
	    
	    if (valor > 0) {
	    	System.out.println("O valor é positivo");
	    	
	       
	    }else System.out.println("O valor é negativo");
	    

	}

}
