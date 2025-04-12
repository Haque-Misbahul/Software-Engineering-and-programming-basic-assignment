
import java.text.DecimalFormat;

public class TestPlanet 
{
 double surfaceGravity(double mass,double radius, double G_constant) 
    {
        double result =G_constant * (mass / (radius * radius));
        return result;
    }
 double surfaceWeight(double mass, double SG) 
    {
        return mass * SG;       
    }
    
    public static void main(String[] args) 
    {
        
        double mass = 175/Planet.EARTH.surfaceGravity();
         // here 175 is the earthweight. this value is calculated from the task sheet using output as well as other values
        DecimalFormat df = new DecimalFormat("#.######");
       
        for(int i=0;i<Planet.values().length;i++)
        {
            System.out.println("Your weight on "+ Planet.values()[i].name() +" is " +df.format(Planet.values()[i].surfaceWeight(mass)));
        }
    
      
    }
}
// reference
// https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html?fbclid=IwAR0upnUm_cYLRwdTO_IUGYV6oz4T4b0qUfuZO-wuGpaHAujYs0aVtlwRETk
    


