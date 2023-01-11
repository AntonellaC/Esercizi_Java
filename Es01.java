package com.corso.es01;

import java.util.Arrays;

public class Es01 {

	public static void main(String[] args) {
		// creare un array di 10 numeri interi
		int[] numeri = { 11, 33, 45, 67, 67, 67, 233, 12, 90, 1000 };
		// stampare a video il max numero dell'array

		// MODO 1
		int maxNum = numeri[0]; // variabile che si prende il primo elemento dell'array per confronto

		for (int a : numeri) {
			if (a > maxNum)
				maxNum = a;
		}
		// System.out.println("Il maggiore numero dell'array è: " + maxNum);

		// MODO 2 (Meno corretto) Stampa tutti gli elementi dell'array
		for (int j : numeri) {
			System.out.println(j + " ");
		}
		int maxNumNN = numeri[1];
		System.out.println("Il secondo numero dell'array è :" + maxNumNN);

		// Ordinare l'array dall'elemento più grande a quello più piccolo
		Arrays.sort(numeri);
		System.out.println("\nArray ordinato");

		// il mio nuovo array (chiamato sempre "numeri") sarà : 11, 12, 33, 45,.....
		for (int j : numeri) {
			System.out.println(j + " ");
		}
		int maxNum2 = numeri[1];
		System.out.println("Il secondo numero dell'array ordinato è :" + maxNum2);

	}
}