package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício14 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		float tamanho;
		float velocidade;
		float soma;
	    System.out.println("Digite o tamanho do arquivo (MB): ");
	    scan = new Scanner(System.in);
		tamanho = scan.nextFloat();
		
		System.out.println("Digite a velocidade da internet: ");
	    scan = new Scanner(System.in);
		velocidade = scan.nextFloat();
		
		soma = (tamanho / velocidade);
		
		System.out.println("O tempo aproximado de download do arquivo é: " + soma);
		
	

	}

}
