package lab_2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_B1 {
	public static void main(String[] args) {
		int radius = Integer.parseInt(showInputDialog("Gi radiusen til kulen"));
		double volum = (double)4/3 * Math.PI * Math.pow(radius, 3);
		showMessageDialog(null, "Volumet til kulen er:\n" + volum);
	}
}
