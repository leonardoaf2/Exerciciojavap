package br.com.generation.aula01;

import java.util.Scanner;
import java.lang.Math;

public class CalculeExpressao {
	
	public static void main(String[] args) {
		
		double a, b, c, d, r, s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite valor de A: ");
		a = ler.nextDouble();
				
		System.out.println("Digite valor de B: ");
		b = ler.nextDouble();
				
		System.out.println("Digite valor de C: ");
		c = ler.nextDouble();
		
		r = Math.pow((a + b), 2.0);
		s = Math.pow((b + c), 2.0);
		d = (r + s) / 2;
		
		System.out.println("O valor de D é: " + d + ".");
	}

}
