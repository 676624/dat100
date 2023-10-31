package no.hvl.dat100;

public class tabeller_2d {

	public static void main(String[] args) {
		boolean[][] auditorium = {
				{true, false, true},
				{false, true, false},
				{true, false, true},
		};
		printTabell(auditorium);
		boolean[][] auditorium2 = kopierTabell(auditorium);
		System.out.println(auditorium);
		System.out.println(auditorium2);
	}
	
	private static void printTabell(boolean[][] auditorium) {
		for (boolean[] rad: auditorium) {
			for (boolean element : rad) {
				System.out.print(element + ", ");
			}
			System.out.println();
		}
	}
	
	private static boolean[][] kopierTabell(boolean[][] tabell){
		boolean [][] kopitabell = new boolean[tabell.length][tabell[0].length];
		for (int r = 0; r < tabell.length; r++) {
			for (int e = 0; e < tabell[0].length; e++) {
				kopitabell[r][e] = tabell[r][e];
			}
		}
		return kopitabell;
	}
}
