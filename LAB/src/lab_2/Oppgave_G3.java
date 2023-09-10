package lab_2;

import java.util.Scanner;

public class Oppgave_G3 {
	public static void main(String[] args) {
		Scanner leser = new Scanner(System.in);
		System.out.println("Skriv inn 2 heltall du vil dividere: ");
		int a = leser.nextInt(), b = leser.nextInt();
		if (b == 0) {
			System.out.println("Feil: Kan ikke dele på 0, prøv igjen");
			return;
		}
		System.out.println("a / b = " + ((float)a / (float)b));
	}
}
