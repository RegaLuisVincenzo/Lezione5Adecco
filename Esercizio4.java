package lezione5AdeccoFineSett1;

import java.util.Scanner;


/*
 * 
 *si preda in ingreso 
 *una stringa  con scanner
 *si creii un anuova stringa
 *reversed
 *
 * ciao ---> oaic
 * 
 * 
 */

public class Esercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner parola=new Scanner(System.in);
		System.out.println("INSERISCI LA PAROLA");
		String frase=parola.nextLine();
		
		int index=frase.length()-1;
		
		String reversed ="";
		
		while(index>=0);{
			
		reversed+=frase.charAt(index);
		
		index--;
		}
		parola.close();
		System.out.println("inverot"+reversed);
	}

}
