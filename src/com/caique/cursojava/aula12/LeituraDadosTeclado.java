package com.caique.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite seu nome completo:");
    String nomeCompleto = scan.nextLine();
    System.out.println("Seu nome completo é: " + nomeCompleto);
    
    System.out.println("Digite seu primeiro nome");
    String primeiroNome = scan.next();
    System.out.println("Seu primeiro nome é: " + primeiroNome);
    
    System.out.println("Digite a sua idade:");
    int idade = scan.nextInt();
    System.out.println("Sua idade é: " + idade);
    
    System.out.println("Digite a sua altura:");
    double altura = scan.nextDouble();
    System.out.println("Sua altura é: " + altura);
    
    System.out.println("Digite o seu primeiro nome, idade, altura, bicho de estimação:");
    String primeiroNome1 = scan.next();
    int idade1 = scan.nextInt();
    float altura1 = scan.nextFloat();
    boolean temBicho = scan.nextBoolean();
    
    System.out.println("Voce digitou os seguintes valores:");
    System.out.println("Primeiro Nome:" + primeiroNome1);
    System.out.println("Idade:" + idade1);
    System.out.println("Altura:" + altura1);
    System.out.println("Tem bicho?:" + temBicho);
    
    
	}

}
