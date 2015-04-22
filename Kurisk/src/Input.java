import java.util.Scanner;

public class Input {
	public static String getUserInput(){
		System.out.print(" >> ");
		Scanner userInput = new Scanner(System.in);
		String theInput = userInput.nextLine();
		theInput.toLowerCase();
        return theInput;
	}
}
