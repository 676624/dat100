package lab_1;

import java.util.Scanner;

public class Oppgave_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vennligst skriv inn dagnummeret");
		int dag = scanner.nextInt();
		System.out.println("Vennligst skriv inn månedsnummeret");
		int måned = scanner.nextInt();
		System.out.println("Vennligst skriv inn årsnummeret");
		int år = scanner.nextInt();
		System.out.println("Datoen er: " + dag + "." + måned + "." + år);
	}
}
