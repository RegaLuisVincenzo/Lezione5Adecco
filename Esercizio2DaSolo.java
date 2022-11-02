package lezione5AdeccoFineSett1;
/* *  2. Data una stringa in input
 *     e un numero intero
 *     stampare la stringa 
 *     tante volte quanto è il numero
 *     
 *     Es ciao 3
 *     
 *     ciao ciao ciao
*/

import java.util.Scanner;

public class Esercizio2DaSolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		System.out.println("INSERISCI PAROLA");
		int parola=key.nextInt();
		double ris= parola*3;
		System.out.println("RIPETO "+ris);
		key.close();
	}

}
