package br.com.generation.aula01;

import java.util.Scanner;

public class CalculeNotas {
	
	public static void main(String[] args) {
		
		double n1, n2, n3, m1, m2, m3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextDouble();
				
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextDouble();
				
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextDouble();
		
		m1 = n1 * 2;
		m2 = n2 * 3;
		m3 = n3 * 5;
		media = (m1 + m2 + m3) / 10;
		
		System.out.println("A média ponderada é: " + media + ".");
	}

}
