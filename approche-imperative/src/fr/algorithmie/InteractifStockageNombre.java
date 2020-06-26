package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		InteractifStockageNombre.test();

	}
	
	public static void test() {
		InteractifStockageNombre.showOptions();
		Scanner scan = new Scanner(System.in);
		int str = scan.nextInt();
		int[] tableau = new int[1];
		int[] nouveauTableau = new int[1];
		int index = 0;
		while(!String.valueOf(str).equalsIgnoreCase("X")) {
			if (str == 1) {
				System.out.println("Choisir un nombre");
				int nombreChoisi = scan.nextInt();

				if(index >= tableau.length) {
					nouveauTableau = Arrays.copyOf(tableau, (tableau.length + 1));
					tableau = nouveauTableau;
					nouveauTableau[index] = nombreChoisi;
				} else {
					nouveauTableau[0] = nombreChoisi;
					tableau = nouveauTableau;
				}
				index++;
			}
			else if(String.valueOf(str).equalsIgnoreCase("2")) {
				// le dernier element rentré sera le premier element du tableau
				AffichageInverse.elementArrayInverse(nouveauTableau);
			}
			System.out.println();
			InteractifStockageNombre.showOptions();
			// ré initialise la chaine de caractère
			str = scan.nextInt();
		}
		
	}
	
	private static void showOptions() {
		System.out.println("Choisir une option :");
		System.out.println("Apuuyer sur 1 -> Ajouter un nombre !");
		System.out.println("Apuuyer sur 2 -> Afficher les nombres existants !");
		System.out.println("Apuuyer sur X -> Quitter");
	}

	private static void messageScanner(String message) {
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
	}
}
