package br.com.generation.aula01;

import java.util.Scanner;

public class CalculeIdade {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, idadeFinal;
		
		
		Scanner ler = new Scanner(System.in);
				
				
		System.out.print("Digite a idade em anos: ");
		idadeAnos = ler.nextInt();
		
		System.out.print("Digite a idade em meses: ");
		idadeMeses = ler.nextInt();
		
		System.out.print("Digite a idade em dias: ");
		idadeDias = ler.nextInt();
		
		idadeFinal = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
		
		System.out.println("A idade em dias é: " + idadeFinal);
	}

}