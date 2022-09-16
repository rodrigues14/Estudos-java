package com.java.fluxo;

import java.util.Scanner;

public class FluxoControle {
	
	public static void main(String[] args) {
		int idade = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		sc.close();
		
		if (idade >= 18 && idade < 70) {
			System.out.println("Maior de idade");
		} else if (idade >= 70) {
			System.out.println("Terceira idade");
		} else {
			System.out.println("Menor de idade");
		}
	}
}
