package main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException, URISyntaxException {
		Menu.start();
		sc.nextLine();
		sc.close();
	}
}
