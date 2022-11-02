package lezione5AdeccoFineSett1;

import java.util.Scanner;

/*
 * 
 * si prenda in input una stringa
 * usando scannare
 * il programma restituise
 * il numero di vocali presenti 
 * 
 * es ciao ---> 3
 * 
 * 
 * 
 */

public class Esercizio1ContaParola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		System.out.println("INSERISCI IL NUMERO");
		String Voc=key.nextLine();
		int quanteVocali=0;// preso l'input che abbiamo bisogno 
		int index=0;
		 key.close();
		while(index < Voc.length())//per ogni vocale vai a scanzionare 
		{
			char myChar= Voc.charAt(index);//indica il valore delle vocali 
			
			if(myChar  == 'a' || myChar == 'e' ||// se la scanzione incontra queste vocali deve cambiare 
					myChar == 'i' || myChar == 'o' ||
					myChar == 'u') {
				quanteVocali++;// quanti numeri che abbiamo scambiato con le vocali 
			}
			index++;//
		}
		System.out.println("ho trovato il numeor delle parole "+Voc);
		System.out.println(quanteVocali);

	}

}
