package lab_2;

import static javax.swing.JOptionPane.*;

import java.util.ArrayList;

public class Oppgave_G4 {
	public static void main(String[] args) {
		
		int[] tall = new int[5];
		
		for (int i = 0; i <= 4;i++) {
			tall[i] = Integer.parseInt(showInputDialog("Gi ett tall"));
			showMessageDialog(null, tall[i]);
		}
		
		/*
		ArrayList<Integer>tall = new ArrayList<Integer>();
		
		for (int i = 1; i <= 5; i++) {
			tall.add(Integer.parseInt(showInputDialog("Gi ett tall")));
			showMessageDialog(null, tall);
		}
		*/
		
	}
}
