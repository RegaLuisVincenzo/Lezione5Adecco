package lezione5AdeccoFineSett1;

import java.util.Scanner;


public class Esercizio2CicliNumiPari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		System.out.println("INSERISCI LA PAROLA  ");
		String voc=key.nextLine();
		int numero = 0;
		key.close();
		
//------ESEMPIO1
		/*
		while(numero<voc.length()){// StAMPIAMO 
		char myChar=voc.charAt(numero);
		if(numero % 2==0) // dichiariamo che ANDIAMO A PRENDERE/ STAMPARE LE LETTERE PARI
		{
			System.out.println(myChar);
		}
			numero++;
		}
		*/
		
//------ESEMPIO2
		while(numero<voc.length()){
			System.out.println(numero);
			numero+=2;
		}
		numero++;
		
	}

}
