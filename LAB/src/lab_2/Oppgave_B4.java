package lab_2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_B4 {
	public static void main(String[] args) {
		int [] trinn_inntekt = {190_349, 267_899, 643_799, 969_199, 2_000_000}; // Øvre grensen for hver inntektstrinn
		double [] trinn_skatt = {0.0, 0.017, 0.04, 0.134, 0.164, 0.174}; // Øvre grensen for hvert trinn
		
		int inntekt = Integer.parseInt(showInputDialog("Hvor mye tjener du?"));

		int inntekt_rest = inntekt;
		int inntekt_skattet = 0;
		for (int i = 0; i <= trinn_inntekt.length; i++) {
			inntekt_rest -= 
		}
		
		// wtfff
		
		if (inntekt <= 190_349) {
			skatt = 0;
		} else if (inntekt <= 267_899){
			skatt = 0.017;
		} else if (inntekt <= 643_799){
			skatt = 0.04;
		} else if (inntekt <= 969_199){
			skatt = 0.134;
		} else if (inntekt <= 1_999_999){
			skatt = 0.164;
		} else if (inntekt >= 2_000_000){
			skatt = 0.174;
		} else {
			showMessageDialog(null, "Noe gikk galt :(");
		}
		showMessageDialog(null, "Trinnskatten din er: " + skatt + "\nSkatt du må betale: " + inntekt * skatt);
	}
	private static int beregnSkattetInntekt(int inntekt) {
		int skattet_inntekt = 0;
		return skattet_inntekt;
	}
}
