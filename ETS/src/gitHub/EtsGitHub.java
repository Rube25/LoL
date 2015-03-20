package gitHub;

import java.util.Scanner;

public class EtsGitHub {
	
	public static void main (String[] arg){
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("No diga mentira y dime tu pais de verdad: ");
	String P = teclado.next();
	
	System.out.print("Tu País es: " + P);
	teclado.close();
}
}
