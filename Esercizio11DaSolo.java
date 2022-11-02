package lezione5AdeccoFineSett1;

import java.util.Scanner;

public class Esercizio11DaSolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.err.println("inserisci numero");

		int nUtente = key.nextInt();
		/*
		 * 
		 * while (nUtente >= 0) { System.out.println("Inserisci numero");
		 * 
		 * nUtente=key.nextInt(); } System.out.println("fine");
		 */
		// funzionamento del do.while
		
		//creiamo un 
		do {
			System.out.println("inserisci");
			nUtente = key.nextInt();
		} while (nUtente >= 0); 
		
		key.close();
	}
}