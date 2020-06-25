package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		InteractifPlusMoins.jeuPlusOuMoins();
	}
	
	public static void jeuPlusOuMoins() {
		int random = (int) (Math.random() * ( 100 - 1 ));
		int tentatives = 0;
		System.out.println("random " + random);
		System.out.println("Trouver le nombre al�atoire");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		InteractifPlusMoins.checkNumberValide(str, random, tentatives, scan);
	}
	
	
	private static void checkNumberValide(String entreeUtilisateur, int nombreAleatoire, int compteurDerreur, Scanner scan) {
		while(Integer.parseInt(entreeUtilisateur) != nombreAleatoire) {
			System.out.println("Trouver le nombre al�atoire");
			scan = new Scanner(System.in);
			 
			if(Integer.parseInt(entreeUtilisateur) < nombreAleatoire) {
				compteurDerreur++;
				InteractifPlusMoins.messageScanner("Plus ! R�essayer !");
				
			} else if (Integer.parseInt(entreeUtilisateur) > nombreAleatoire) {
				compteurDerreur++;
				InteractifPlusMoins.messageScanner("Moins ! R�essayer !");
			}
			entreeUtilisateur = scan.nextLine();
		}	
		System.out.println("Bien jou� vous avez trouv� !");
		System.out.println("Nombre de tentatives : " + compteurDerreur);
	}
	
	
	private static void messageScanner(String message) {
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
	}
}
