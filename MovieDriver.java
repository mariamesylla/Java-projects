import java.util.Scanner;

public class MovieDriver {

	public static void Main(String[] args) {
		
	String movieTitle;
	String movieRate;
	String numTicket;
	String resp;
	
	Scanner objK= new Scanner(System.in);
	Movie movie = new Movie();
	Scanner kbr = new Scanner (System.in);
	do{
		System.out.println("Please enter the title of movie");
	resp= kbr.next();
	
	movieTitle= objK.nextLine();
	
	movie = movieTitle;
	
	System.out.println("Please enter the movie’s rating");
	movieRate= objK.nextLine();
	
	movie = movieRate;
	
	System.out.println("Please enter the number of tickets sold at the theater");
	numTicket= objK.next();
	
	movie = numTicket;
	
	System.out.println(movie.toString());

	System.out.println("Do you want to enter another movie? (y or n)");
	resp= kbr.next();
	}while (resp =="y");
		/**
		Create a new movie object
		Prompt the user to enter the title of a movie 
		Read in the line that the user types
		Set the title in the movie object
		Prompt the user to enter the movie’s rating
		Read in the line that the user types
		Set the rating in the movie object
		Prompt the user to enter the number of tickets sold at a (unnamed) theater
		Read in the integer that the user types
		Set the number of tickets sold in the movie object
		Print out the information using the movie’s toString method*/


	}

}
