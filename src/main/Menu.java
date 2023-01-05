package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import outils.PrintTools;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Menu{
	static Scanner sc = new Scanner(System.in);
	static int choix = 0;

	public static void start() throws IOException, URISyntaxException {
		choix = 0;
		PrintTools.clearScreen();
		PrintTools.printPath("/src/main/logo.txt");
		Verification(3);
		if (choix == 1) {
			Menu2.start();
		} else if (choix == 2) {
			PrintTools.clearScreen();
			Desktop.getDesktop().browse(
					new URI("https://drive.google.com/drive/u/0/folders/1wXXiH3ix1GCuq3uR3QaN8zQcQYXkSsSS?ths=true"));
			System.out.print("\n\nVeuillez appuyer sur entree pour revenir au menu");
			sc = new Scanner(System.in);
			sc.nextLine();
			start();

		} else {
			System.out.println("Au revoir");
			sc.close();
			System.exit(0);
		}
	}

	public static int Verification(int nbChoix) {
		try {
			sc = new Scanner(System.in);
			while ((choix = sc.nextInt()) > nbChoix || choix < 0) {
				System.out.println("La valeur rentre ne correspond pas");
			}

		} catch (InputMismatchException e) {
			System.out.println("Tu ne peux pas mettre de lettres!");
			Verification(nbChoix);
		}
		return choix;
	}

}
