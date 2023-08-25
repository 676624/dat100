package lab_1;

import java.util.Scanner;

public class Oppgave_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vennligst skriv inn lengden på rektangelet");
		int lengde = scanner.nextInt();
		System.out.println("Vennligst skriv inn bredden på rektangelet");
		int bredde = scanner.nextInt();
		int areal = lengde * bredde;
		System.out.println("Lengde: " + lengde + "\nBredde: " + bredde + "\nAreal: " + areal);
	}
}
