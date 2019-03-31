package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício3 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		System.out.println("Informe seu sexo - F/f(feminino) , M/m(masculino):");
		String sexo = teclado.next(); 
		if ("f".equalsIgnoreCase(sexo)){
			System.out.println("sexo feminino!");
		}else if("m".equalsIgnoreCase(sexo)){
			System.out.println("sexo masculino!");
		}else{
			System.out.println("sexo Invalido!");
		}
		
		
		

	}

}
