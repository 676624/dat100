package no.hvl.dat100;

import java.util.Arrays;

public class lister {
	static int[] lottoTall = {34,2,7,16,21,29,1};
	static int[] kupong2 = {12,1,34,16,2,25,26};
	static int[] kupong3 = {2,7,34,16,21,1,29};

	public static boolean finnesTall(int tall, int[]tabell) {
		boolean funnet = false;
		
		int i = 0;
		
		while (!funnet && i < tabell.length) {
			if(tall == tabell[i]) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}
	public static boolean sjekkKupong(int[] kupong, int[]lottoTall) {
		boolean fantTall = true;
		
		int i = 0;
		
		while(fantTall && i < lottoTall.length) {
			int tall = lottoTall[i];
			fantTall = finnesTall(tall, kupong);
			i++;
		}
		return fantTall;
	}
	public static void main(String[] args) {
		System.out.println(sjekkKupong(kupong2, lottoTall));
		System.out.println(sjekkKupong(kupong3, lottoTall));
	}
}
