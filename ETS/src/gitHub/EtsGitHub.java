package gitHub;

import java.util.Scanner;

public class EtsGitHub {
	
	public static void main (String[] arg){
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Dime tu Pa�s: ");
	String P = teclado.next();
	
	System.out.print("Tu Pa�s es: " + P);
	teclado.close();
}
}