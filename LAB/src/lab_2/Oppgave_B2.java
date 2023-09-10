package lab_2;

import static javax.swing.JOptionPane.*;

public class Oppgave_B2 {
	public static void main(String[] args) {
		int pris = Integer.parseInt(showInputDialog("Skriv inn prisen på produktet:"));
		int beløp = Integer.parseInt(showInputDialog("Skriv inn det betalte beløpet:"));
		
		int gjenbetaling = beløp - pris;
		
		int mynter_10 = gjenbetaling / 10;
		int mynter_1 = gjenbetaling % 10;
		
		showMessageDialog(null, "10-kroninger: " + mynter_10 + "\n1-kroninger: " + mynter_1);
	}
}
