package com.corso.es02;

public class Es02 {

	public static void main(String[] args) {
		// Creare un array di stringhe costituita dalla parola Ciao divisa in
		// lettere,stampare.
		// stampare il 2° elemento dell'array

		String[] lettere = { "C", "I", "A", "O" };
		System.out.println("La parola Ciao è così divisa: ");

		for (String j : lettere) {
			System.out.println(j + "");

		}
		String secondo_elemento = lettere[1];
		System.out.println("\nIl secondo elemento dell'array è: " + secondo_elemento);

	}
}