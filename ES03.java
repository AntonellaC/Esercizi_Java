package com.corso.es03;

import java.util.Arrays;

public class ES03 {

	public static void main(String[] args) {
		// Scrivere un array chiamato array avente i seguenti numeri: 12, 99, 33, 27,
		// 100, 1000.
		// trovare il massimo numero, ordinare l'array e prendere il 4° elemento
		// dell'array ordinato e non ordinato.
		// scrivere un array di stringhe con all'interno la parola ANTO e stamparla a video.

		// Passo1: Scrivere un array chiamato array avente i seguenti numeri: 12, 99,
		// 33, 27, 100, 1000.
		int[] array = { 12, 99, 33, 27, 100, 1000 };

		// Passo2: trovare il massimo numero, ordinarlo e prendere il 4°elemento

		// il massimo elemento dell'array
		int i;
		int massimo;
		massimo = array[0];
		for (i = 0; i <= array.length - 1; i = i + 1) {
			if (array[i] > massimo) {
				massimo = array[i];
			}
		}
		System.out.println("Il massimo elemento dell'array è: " + massimo);

		// ordinare array
		Arrays.sort(array);
		System.out.println("\nArray ordinato: ");

		// array ordinato
		for (int e : array) {
			System.out.println(e + " ");
		}
		// il 4° numero dell'array ordinato
		int maxNum4 = array[3];
		System.out.println("\nIl quarto numero dell'array ordinato è: " + maxNum4);

		// Passo3: scrivere un array di stringhe con all'interno la parola ANTO e stamparla a
		// video.

		String[] parola = { "A", "n", "t", "o" };
		System.out.print("\nLa parola è: ");

		for (String j : parola) {
			System.out.print(j+ "");

		}
	}
}
