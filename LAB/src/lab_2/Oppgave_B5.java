package lab_2;

import static javax.swing.JOptionPane.*;

public class Oppgave_B5 {
	public static void main(String[] args) {
		char karakter = showInputDialog("Hvilken karakter ønsker du?").charAt(0);
		switch (karakter) {
		case 'a': case 'A': {
			showMessageDialog(null, "Du trenger 100 - 90 poeng");
			break;
		}
		case 'b': case 'B': {
			showMessageDialog(null, "Du trenger 89 - 80 poeng");
			break;
		}
		case 'c': case 'C': {
			showMessageDialog(null, "Du trenger 79 - 60 poeng");
			break;
		}
		case 'd': case 'D': {
			showMessageDialog(null, "Du trenger 59 - 50 poeng");
			break;
		}
		case 'e': case 'E': {
			showMessageDialog(null, "Du trenger 49 - 40 poeng");
			break;
		}
		case 'f': case 'F': {
			showMessageDialog(null, "Du trenger 39 - 0 poeng");
			break;
		}
		default:
			throw new IllegalArgumentException("Ugyldig verdi: " + karakter);
		}
	}
}
