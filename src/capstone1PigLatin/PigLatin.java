package capstone1PigLatin;
import java.util.*;
public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String userInput;
		String userLine;
		
		
		
		
		
		System.out.println("Welcome to Pig Latin Translator!");
		
		do {
			System.out.println();
			System.out.println("Enter a line to be translated: ");
			userLine= scnr.nextLine();
			
			//aqui llamada a el metodo probable asignar a una variable
			
			//System.out.println(la variable de arriba );esto es la salida ya traducida
			
			System.out.println();
			System.out.println("Translate another line? (y/n):" );
			userInput = scnr.next();
		}
		while(userInput.equals("y") || userInput.equals("Y"));
		System.out.println("Thank you for use this translator!");
		scnr.close();

	}

}
