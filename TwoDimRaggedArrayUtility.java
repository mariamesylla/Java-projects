import java.util.*;
import java.lang.*;
class TwoDimRaggedArrayUtility{
   public static double[][] readFile(File file)
   {
       double[][] raggedArr=new double[6][];
       String line;
       int i=0;
       try
       {
           BufferedReader br=new BufferedReader(new FileReader(file));      
           while((line=br.readLine())!=null)
           {
               String[] temp=line.split(" ");
               int size=temp.length;
               raggedArr[i]=new double[size];
               for(int j=0;j<size;j++)
               {
                   raggedArr[i][j]= Double.parseDouble(temp[j]);
               }
               i++;
           }
           br.close();
       }
       catch(Exception ep)
       {
           ep.printStackTrace();
       }
       return raggedArr;
   }
   public static void writeToFile(double[][] raggedArr,File file)
   {

       try
       {
           BufferedWriter br=new BufferedWriter(new FileWriter(file));
           for(int i=0;i<raggedArr.length;i++)
           {
               for(int j=0;j<raggedArr[i].length;j++)
               {
                   br.write(raggedArr[i][j]+" ");
               }
               br.newLine();
           }
           br.close();
       }
       catch(Exception ep)
       {
           ep.printStackTrace();
       }

   }
   public static double getTotal(double[][] raggedArr)
   {
       double total=0;
       for(int i=0;i<raggedArr.length;i++)
       {
           for(int j=0;j<raggedArr[i].length;j++)
           {
               total += raggedArr[i][j];
           }
       }
       return total;
   }
   public static double getAverage(double[][] raggedArr)
   {
       double total=0;
       int numOfElements=0;
       for(int i=0;i<raggedArr.length;i++)
       {
           for(int j=0;j<raggedArr[i].length;j++)
           {
               total += raggedArr[i][j];
               numOfElements += 1;
           }
       }
       return (total/numOfElements);
   }
   public static double getRowTotal(double[][] raggedArr,int rowIndex)
   {
       double total=0;
       for(int j=0;j<raggedArr[rowIndex].length;j++)
       {
           total += raggedArr[rowIndex][j];

       }
       return total;
   }
   public static double getColumnTotal(double[][] raggedArr,int colIndex)
   {
       double total=0;
       for(int i=0;i<raggedArr.length;i++)
       {
           if(colIndex<=raggedArr[i].length-1)
               total += raggedArr[i][colIndex];
       }
       return total;
   }
   public static double getHighestInRow(double[][] raggedArr,int rowIndex)
   {
       double highest=raggedArr[rowIndex][0];
       for(int j=0;j<raggedArr[rowIndex].length;j++)
       {
           if(raggedArr[rowIndex][j]>highest)
               highest= raggedArr[rowIndex][j];

       }
       return highest;
   }
   public static double getLowestInRow(double[][] raggedArr,int rowIndex)
   {
       double lowest=raggedArr[rowIndex][0];
       for(int j=0;j<raggedArr[rowIndex].length;j++)
       {
           if(raggedArr[rowIndex][j]<lowest)
               lowest= raggedArr[rowIndex][j];

       }
       return lowest;
   }
   public static double getHighestInColumn(double[][] raggedArr,int colIndex)
   {
       double highest=raggedArr[0][colIndex];
       for(int i=0;i<raggedArr.length;i++)
       {
           if(colIndex<=raggedArr[i].length-1)
           {               
               if(raggedArr[i][colIndex]>highest)
                   highest= raggedArr[i][colIndex];
           }

       }
       return highest;     
   }
   public static double getLowestInColumn(double[][] raggedArr,int colIndex)
   {
       double lowest=raggedArr[0][colIndex];
       for(int i=0;i<raggedArr.length;i++)
       {
           if(colIndex<=raggedArr[i].length-1)
               if(raggedArr[i][colIndex]<lowest)
                   lowest= raggedArr[i][colIndex];

       }
       return lowest;  
   }
  public static double getHighestInArray(double[][] raggedArr)
   {
       double highest=raggedArr[0][0];
       for(int i=0;i<raggedArr.length;i++)
       {
           for(int j=0;j<raggedArr[i].length;j++)
           {
               if(raggedArr[i][j]>highest)
                   highest= raggedArr[i][j];

           }
       }
       return highest;
   }
   public static double getLowestInArray(double[][] raggedArr)
   {
       double lowest=raggedArr[0][0];
       for(int i=0;i<raggedArr.length;i++)
       {
           for(int j=0;j<raggedArr[i].length;j++)
           {
               if(raggedArr[i][j]<lowest)
                   lowest= raggedArr[i][j];

           }
       }
       return lowest;
   }
}
