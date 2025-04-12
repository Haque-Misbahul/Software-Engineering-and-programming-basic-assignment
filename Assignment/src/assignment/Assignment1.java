
package assignment;

import java.util.Scanner;
public class Assignment1 
{

    
     public static int herdDivisors(int sheep)
        {
          
           int count = 0;
   
            for( int i = 1; i <= sheep; i++)
               {
                   if ( sheep % i == 0)
                   count++; 
               }
                   return count;
        }
    public static String getColourByID(int ID)
    {  
       if (ID > 0)
       {
        
             if (ID % 3 == 0)
             return "black";
       
             else if (ID % 5 == 0)
               return "brown";
             else
                {
                   int count = 0;
   
                    for( int i = 1; i <= ID; i++)
                    {
                       if ( ID % i == 0)
                        count++; 
                    }
                         if (count == 2)
                           return "lucky";
                         else
                           return "white";    
                }
       } 
       else
         return "Invalid number";
    }
    
    public static void main(String[] args) 
    {
       
        Scanner myObj = new Scanner(System.in);
        //int sheep = myObj.nextInt(); 
        
        //System.out.println(herdDivisors(sheep));
        
        int ID = myObj.nextInt(); 
        
       System.out.println(getColourByID(ID));
        //public static double countSheep(double legs, double sheeps)
      
       // public static int fur_ColourRatio(int black, int white)
                
       // public static double canFeed(double sheep, double hay)
        
        //public static double calculateSales(double sheep, double value)
   
        
    
    }
    
}


  