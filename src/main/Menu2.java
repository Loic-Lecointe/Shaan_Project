package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import outils.PrintTools;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Menu2{
	static Scanner sc = new Scanner(System.in);
	static int choix = 0;

	public static void start() throws IOException, URISyntaxException {
		choix = 0;
		PrintTools.clearScreen();
		PrintTools.printPath("/src/main/Menu2.txt");
		Verification(12);
		if (choix == 1) {
		 System.out.println("Novateur");
		} else if (choix == 2) {
			System.out.println("Erudit");
		} else if (choix == 3) {
			System.out.println("Négociant");
		}else if (choix == 4) {
			System.out.println("Artistes");	
		}else if (choix == 5) {
			System.out.println("Shaaniste");
		}else if (choix == 6) {
			System.out.println("Magiciens");	
		}else if (choix == 7) {
			System.out.println("Elémentaliste");
		}else if (choix == 8) {
			System.out.println("Combattants");	
		}else if (choix == 9) {
			System.out.println("Voyageurs");
		}else if (choix == 10) {
			System.out.println("Ombres");	
		}else if (choix == 11) {
			System.out.println("Artiste");
		}else {
			Menu.start();
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
