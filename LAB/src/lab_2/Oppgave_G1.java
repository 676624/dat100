package lab_2;

public class Oppgave_G1 {
	public static void main(String[] args) {	
		// a)
		int a = 5, b = 7;
		// b)
		System.out.println(a);
		System.out.println(b);
		// c)
		// System.out.println((boolean)a);
		// Error: Cannot cast from int to boolean
		// Dette er ikke en lovlig operasjon siden de er to datatyper som representerer forskjellige ting
		// Det vil ikke gi mening å konvertere fra et hvilket som helst tall til enten 0 eller 1
	}
}
