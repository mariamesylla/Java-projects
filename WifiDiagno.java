import java.util.Scanner;

public class WifiDiagno {
	
	public static void main(String[] args) {
 
		System.out.println("HELLO");

  String answers ;

System.out.println( "If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
System.out.println( "Reboot	your	computer\n");
	
System.out.println( "Are	you	able	to	connect	with	the	internet?	(yes	or	no)");

Scanner kbr= new Scanner(System.in);

 answers = kbr.next();
 
 if (answers.equals("yes")) {
	System.out.println("Rebooting	your	computer	seemed	to	work	");
	}
 
 else if (answers.equals("no"))
   	{
	System.out.println( "Second	step:	reboot	your	router	");
	System.out.println("Now	are	you	able	to	connect	with	the	internet?	(yes	or	no)");
	}
 else 
	{System.out.println("try again");}
	
 


 answers = kbr.next();
 
if (answers.equals("yes")) 
	{System.out.println("Rebooting the router seemed to work");}
else if (answers.equals("no"))
{System.out.println("Third	step:	make	sure	the	cables	to	your	router	are	plugged	in	firmly	and	your	router	is	getting	power");
System.out.println(" Now are you	able	to	connect	with	the	internet?	(yes	or	no)	");}
else {System.out.println  ("try again");}

answers = kbr.next();

if (answers.equals("yes")) {
	System.out.println("Checking	the	router's	cables	seemed	to	work.");}

else if (answers.equals("no"))
{System.out.println( "Fourth	step:	move	your	computer	closer	to	your	router");
System.out.println("Now	are	you	able	to	connect	with	the	internet?	(yes	or	no)	");}

else {System.out.println  ("try again");}



answers = kbr.next();

if (answers.equals("yes")) {
	System.out.println("Moving	your	computer	closer	to	your	router seemed	to	work.");
}
else if (answers.equals("no"))
	{System.out.println( "Fifth	step:	contact	your	ISP");
	System.out.println("Make	sure	your	ISP	is	hooked	up	to	your	router.");

}
else {System.out.println  ("try again");}


}
}

