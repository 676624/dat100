package lab_1;

import java.util.Scanner;

public class Oppgave_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vennligst skriv inn tall 1");
		int tall1 = scanner.nextInt();
		System.out.println("Vennligst skriv inn tall 2");
		int tall2 = scanner.nextInt();
		System.out.println("Vennligst skriv inn tall 3");
		int tall3 = scanner.nextInt();
		System.out.println("Vennligst skriv inn tall 4");
		int tall4 = scanner.nextInt();
		System.out.println("Det minste tallet er : " + Math.min(Math.min(tall3, tall4),Math.min(tall1, tall2)));
	}
}
