package lab_1;

import easygraphics.*;

public class Oppgave_6 extends EasyGraphics{
	public static void main(String[] args) {
		launch(args);
	}
	public void run() {
		
		makeWindow("Det tyske flagget");
		
	    String størrelse = getText("Størrelse(%):");
	    int skalar = Integer.parseInt(størrelse);
	    skalar /= 100;
	    
	    int flaggBredde = 500 * skalar;
	    int flaggHøyde = 300 * skalar;
	    
	    setColor(0, 1, 1); // Svart
	    fillRectangle(0, flaggHøyde * 1/3 * 0 , flaggBredde, flaggHøyde * 1/3);
	    
	    setColor(255, 1, 1); // Rødt
	    fillRectangle(0, flaggHøyde * 1/3 * 1, flaggBredde, flaggHøyde * 1/3);
	    
	    setColor(255, 206, 0); // Gult
	    fillRectangle(0, flaggHøyde * 1/3 * 2, flaggBredde, flaggHøyde * 1/3);

	}
}
