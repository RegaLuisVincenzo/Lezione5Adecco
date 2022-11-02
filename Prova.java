package lezione5AdeccoFineSett1;

public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Jacek"; 
		String str = "X"; 
		str = str.replaceAll("X", "XXXXXXXXXX"); 
		str = str.replaceAll("X", "XXXXXXXXXX"); 
		str = str.replaceAll("X", "XXXXXXXXXX"); 
		str = str.replaceAll("X", name + "\n"); 
		System.out.println(str); 

	}

}
