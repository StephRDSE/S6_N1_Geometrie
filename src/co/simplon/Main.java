package co.simplon;

import java.util.Scanner;

public class Main {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("bonjour." + "\n" + "Vous souhaitez effectuer des calculs géométriques ?" + "\n"
				+ "Indiquez votre choix.");
		int calcRetries = 0;
		boolean endOfProg = false;
		String answer = "";

		do {
			if(calcRetries>0) {
				System.out.println("Avez vous encore besoin de moi ?");
			}
			System.out.println("Voici les choix possibles :" + "\n" + "0) Sortir du programme." + "\n"
					+ "1) Calcul de l'aire d'un triangle." + "\n" + "2) Calcul du volume d'une sphère.");

			answer = in.nextLine();

			switch (answer)

			{

			case "1":
				surfaceTriangle();
				calcRetries += 1;
				break;

			case "2":
				volumeSphere();
				calcRetries += 1;
				break;

			case "0":
				System.out.println("Bonne journée");
				endOfProg = true;
				break;

			default:
				System.out.println("Donnez une réponse correcte");
				
			}

		} while (!endOfProg);

		in.close();
	}

	private static void volumeSphere() {
		double volume = 0;
		double ray=0;
		System.out.println("Quelle est le rayon de la sphère");
		ray = in.nextDouble();
		in.nextLine();
		volume = (4/3)*Math.PI*ray*ray*ray;
		
		
		System.out.println("Votre sphère fait : " + volume + " indice ^3");
	}

	private static void surfaceTriangle() {
		double surface = 0;
		double base = 0;
		double height = 0;
		System.out.println("Quelle est la base du triangle");
		base = in.nextDouble();
		in.nextLine();
		System.out.println("Quelle est la hauteur du triangle");
		height = in.nextDouble();
		in.nextLine();
		surface = (base * height) / 2;
		System.out.println("Votre triangle fait : " + surface + " indice ²");

	}
}
