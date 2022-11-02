package lezione5AdeccoFineSett1;

import java.util.Scanner;

/*
 * 1- Scrivere un programma che prenda
 *     in ingresso una stringa e 
 * 	   stampi a video se la stringa
 *     e palindroma.
 *     
 *     Palindroma : posso leggere la
 *     parola da sinistra verso destra
 *     oppure da destra verso sinistra.
 *     
 *     Es : anna --> è palindroma
 *          ciao --> non è palindroma
 * 
 * 
 */

public class Esercizio1DaSolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		System.out.println("INSERISCI LA PAROLA");
		String parola1=key.nextLine();
		String reversed="";
		int index=parola1.length();
		while(index>=0){
			reversed += parola1.charAt(index);
			index--;
		}
		if (reversed.equals(parola1)) {
			System.out.println("La parola " + parola1 + " è Pelindroma");
		} else {
			System.out.println("La parola " + parola1 + " non è Pelindroma");
		}
	
	}

}
