import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		System.out.println("HELLO");

  String answers ;

System.out.println( "If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
System.out.println( "Reboot	your	computer");
	
System.out.println( "Are	you	able	to	connect	with	the	internet?	(yes	or	no)");

Scanner kbr= new Scanner(System.in);

 answers = kbr.nextLine();
 
 if (answers == "yes") {
	System.out.println("Rebooting	your	computer	seemed	to	work	");
	}
 
 if (answers == "no")
   	{
	System.out.println( "Second	step:	reboot	your	router	");
	}
 //  else 
//	{System.out.println("try again");}
	
 
System.out.println("Now	are	you	able	to	connect	with	the	internet?	(yes	or	no)");

 answers = kbr.nextLine();
 
if (answers == "yes") 
	{System.out.println("Rebooting the router seemed to work");}
 if (answers == "no")
{System.out.println("Third	step:	make	sure	the	cables	to	your	router	are	plugged	in	firmly	and	your	router	is	getting	power");
}
//else {System.out.println  ("try again");}

System.out.println(" Now are you	able	to	connect	with	the	internet?	(yes	or	no)	");

answers = kbr.nextLine();

if (answers == "yes") {
	System.out.println("Checking	the	router's	cables	seemed	to	work.");}

if (answers == "no")
{System.out.println( "Fourth	step:	move	your	computer	closer	to	your	router");}
//else {System.out.println  ("try again");}

System.out.println("Now	are	you	able	to	connect	with	the	internet?	(yes	or	no)	");

answers = kbr.nextLine();

if (answers == "yes") {
	System.out.println("Moving	your	computer	closer	to	your	router seemed	to	work.");
}
if (answers == "no")
	{System.out.println( "Fifth	step:	contact	your	ISP");
}
//else {System.out.println  ("try again");}

System.out.println("Make	sure	your	ISP	is	hooked	up	to	your	router.");

}
	}

