package br.com.generation.aula01;

import java.util.Scanner;

public class CalculeCusto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cC, cF;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do carro: ");
		cF = ler.nextDouble();
		
		cC = cF + (cF * 0.73);
		
		System.out.println("O custo ao consumidor é de: " + cC + ".");
	}

}
