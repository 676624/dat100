package no.hvl.dat100;

public class rekursivitet {
	public static void main(String[] args) {
		System.out.println(f(4));
	}
	public static int f(int n) {
		if (n == 0) return 1;
		else return (n*f(n-1));
	}
	int verdi;
	int[] resten;
	public static int lengde(int[] liste) {
		if(liste == null) return 0;
		else return(1 + lengde(liste.resten))
	}
}
