package lab_2;

import static javax.swing.JOptionPane.*;

public class Oppgave_B3 {
	public static void main(String[] args) {
		
		String valid_brukernavn = "simsine";
		String valid_passord = "hei";
		
		boolean riktig = false;
		while(!riktig) {
			String brukernavn = showInputDialog("Brukernavn :");

			String passord = showInputDialog("Passord :");

			if(brukernavn.equals(valid_brukernavn) && passord.equals(valid_passord)) {
				showMessageDialog(null, "Riktig!");
				break;
			} else {
				showMessageDialog(null, "Feil, prøv på nytt");
				continue;
			}
		}
	}
}
