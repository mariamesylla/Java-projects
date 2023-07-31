
public class GraphManager implements GraphManagerInterface
{
	   private double xLeft, xRight;
	   private double yTop = Integer.MIN_VALUE;
	   private double yBottom = Integer.MAX_VALUE;
	   private int functionChoice = -999;
	   Function function1, function2, function3,
	   function4, function5, function6;

  
   GraphManager()
   {
       function1 = new Function1();
       function2 = new Function2();
       function3 = new Function3();
       // added new functions
       function4 = new Function4();
       function5 = new Function5();
   }

  
   public double getFnValue(int fnNum, double x) {
       switch (fnNum) {
       case 1:
           return function1.fnValue(x);
       case 2:
           return function2.fnValue(x);
       case 3:
           return function3.fnValue(x);
       case 4:
           return function4.fnValue(x);
       case 5:
           return function5.fnValue(x);
       default:
           return 0;
       }
   }

  
   public void setFunctionChoice(int choice) {
       functionChoice = choice;
   }

   /**
   * Gets the function index previously selected by the user
   *
   * @return an index 1-4 corresponding to a function
   */
   public int getFunctionChoice() {
       return functionChoice;
   }
  
   public Function getFunction(int choice)
   {
       switch (choice) {
       case 1:
           return function1;
       case 2:
           return function2;
       case 3:
           return function3;
       case 4:
           return function4;
       case 5:
           return function5;
       default:
           return null;
       }
   }

   /**
   * Sets the left and right extents to be considered,
   * and computes and sets the minimum and
   * maximum values of f(x) for those left-right extents.
   */
   public void setExtents(double xLeft, double xRight, double d) {
       this.xLeft = xLeft;
       this.xRight = xRight;
       double x0 = xLeft, x1 = 0, y1;
       Function fn = getFunction(functionChoice);
       yTop = Integer.MIN_VALUE;
       yBottom = Integer.MAX_VALUE;
       y1 = fn.fnValue(x0);
       if (y1 > yTop && y1 < Integer.MAX_VALUE)
           yTop = y1;
       if (y1 < yBottom && y1 > Integer.MIN_VALUE)
           yBottom = y1;
       for (int i = 1; i < d; i++) {
           x1 = x0 + ((xRight - xLeft) / d);
           y1 = fn.fnValue(x1);
           if (y1 > yTop && y1 < Integer.MAX_VALUE)
               yTop = y1;
           if (y1 < yBottom && y1 > Integer.MIN_VALUE)
               yBottom = y1;
           x0 = x1;
       }
       System.out.println("xLeft = " + xLeft
               + "; xRight = " + xRight + " maxY = "
               + yTop + "; minY = " + yBottom
               + " gridWidth = " + d);
   }

   /**
   * Gets the left extent of the function
   * to be considered*/
   public double getLeftExtent() {
       return xLeft;
   }

   /**
   * Gets the right extent of the
   * function to be considered*/
   public double getRightExtent() {
       return xRight;
   }

   /**
   * Gets the top extent of the function to be considered
   */
   public double getTopExtent() {
       return yTop;
   }

   /**
   * Gets the bottom extent of the function to be considered
   */
   public double getBottomExtent()
   {
       return yBottom;
   }

   public String toString()
   {
       String rtnString = "";
       rtnString += "1. " + function1.toString() + "\n";
       rtnString += "2. " + function2.toString() + "\n";
       rtnString += "3. " + function3.toString() + "\n";
       rtnString += "4. " + function4.toString() + "\n";
       rtnString += "5. " + function5.toString() + "\n";
       return rtnString;
   }
}

