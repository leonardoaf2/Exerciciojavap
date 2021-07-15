package br.com.generation.aula01;

import java.util.Scanner;

public class CalculeSegundos {
	
	public static void main(String[] args) {
		
		int totalSeg, horas, minutos, segundos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite quantos segundos teve esse evento: ");
		totalSeg = ler.nextInt();
				
			horas = totalSeg / 3600;
			minutos = (totalSeg % 3600) / 60;
			segundos = (totalSeg % 3600) % 60;
			
			System.out.println("Seu evento durou: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
	}

}
