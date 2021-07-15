package br.com.generation.aula01;

import java.lang.Math;
import java.util.Scanner;

public class CalculePlano {
	
	public static void main(String[] args) {
		
		double p1, p2, x1, x2, y1, y2, d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextDouble();
		
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2.0);
		p2 = Math.pow((y2 - y1), 2.0);
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distância entre os pontos é: " + d + ".");
	}

}
