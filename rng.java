//Magnan Sylla CMSC 203
import java.util.Scanner;
import java.util.Random;

public class rng{
	

public static void main (String [] args) {
	
	Random rng = new Random();
	int randNum = rng.nextInt(101);
	boolean correctNum = false;
	int lowGuess=1;
	int i =0; 
	String restart;
	 int highGuess = 100;

System.out.println("WELCOME");
	System.out.println("Please enter your first guess");

	Scanner kbr= new Scanner (System.in);
		int guessNum = kbr.nextInt();
		
		do {
		
		i+=1;
	

		System.out.println("Number of guesses is " + i);
	
	if (guessNum < randNum){
	System.out.println("Your guess is too low");
	lowGuess=guessNum;
	System.out.println("Enter your next guess between "+ lowGuess+" and " + highGuess );
		guessNum=kbr.nextInt();
	}
	 else if (guessNum  > randNum){
		 
	System.out.println("Your guess is too high");
	highGuess=guessNum;
	
	System.out.println("Enter your next guess between "+ lowGuess + " and " + highGuess );
		guessNum=kbr.nextInt();
	}
	else {			
			System.out.println("Congratulations, you guessed correctly");
			System.out.println("Try again? (yes or no)"	);
			
			Scanner kbr1= new Scanner(System.in);
				restart=kbr1.next();
				if (restart =="yes") 
				guessNum=0;
				System.out.println("Please enter your first guess");

					 guessNum = kbr.nextInt();
					
		        correctNum=true;
	}
	} while (!correctNum);
	
	System.exit(0);
	}
}

