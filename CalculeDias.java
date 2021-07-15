package br.com.generation.aula01;

import java.util.Scanner;

public class CalculeDias {
	
	public static void main(String[] args) {
		
		int idadeDias, anos, meses, dias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade em dias: ");
		idadeDias = ler.nextInt();
				
			anos = idadeDias / 365;
			meses = (idadeDias % 365) / 30;
			dias = (idadeDias % 365) % 30;
			
		System.out.println("Sua idade é: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
	}

}
