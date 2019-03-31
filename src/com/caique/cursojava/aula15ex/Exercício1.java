package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício1 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);		
		
       
    System.out.println("Digite o primeiro número: ");
    int num1 = scan.nextInt();
    
    System.out.println("Digite o segundo número: ");
    int num2 = scan.nextInt();
    
    
    if (num1 > num2) {
    	System.out.println("O maior número é o: " + num1);
    	
    }else System.out.println("O maior número é o: " + num2);
    
    
    
	}

}
