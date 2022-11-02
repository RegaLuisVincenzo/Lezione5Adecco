package lezione5AdeccoFineSett1;

import java.util.Scanner;


/*
 * 
 * SCRIVI UN PROGRAMMA CHE PRENDA 
 * IN INPUT 2 STRINGHE
 * 
 * SE  LE DUE SCRINGHE HANNO UN DIMENSIONE DIVERS A
 * IL PROGRAMMA NON PUO' ESEGUIRE IL SEGUENTE PROGRAMMA 
 * 
 * if(parola1.lenght()!=parola2.length()) exit(0)

 * 
 * IL PORGRAMMA COSTRUITA CON IL NUOVO PROGRAMMA 
 * NEL SEGUENTE MODO
 * 
 */

public class Esercizio3Cicli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		System.out.println("INSERISCI ");
		// PRENDERE DUE  STRINGHE INPUT
		String parola1=key.nextLine();
		
		String parola2=key.nextLine(); 
		int index=0;
		key.close();
		// DICHIARARE SE LE DUE STTRINGHE SONO DIVERSE 
		if(parola1.length()!= parola2.length()) {
			
			System.exit(0);
		}
//----ESEMPIO1--------------------------------------
		/*
			while( index<=parola1.length()) ;
			
			System.out.println(parola1.charAt(index));
			System.out.println(parola2.charAt(index+1));
			index+2;
			
		index++;
		*/
		
//----ESEMPIO2----------------------------------------
		
		String parolaCombinato = "";//inserimento di una nuova stringa
		
		while( index<=parola1.length()) {
			if(index%2==0)
				parolaCombinato+=parola1.charAt(index);
			else
				parolaCombinato+=parola1.charAt(index);
			
			index++;
		}
		
		System.out.println(parolaCombinato);
		System.out.println("parola"+index);
	}

}
