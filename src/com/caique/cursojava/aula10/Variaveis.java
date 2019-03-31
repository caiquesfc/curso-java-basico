package com.caique.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção java
		int idade = 22;
		String nome = "Caique";
		String nomeDoMeuCachorro = "Lilica";
		String ano2018 = "2018";
		
		//aceito, mas nao utilizado
		int _idade;
		int $idade;
		
		//não é convenção java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 22;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		System.out.println("Ano = " + ano2018);
		//má pratica
		int a = 10;
		String b = "Caique";
	}

}
