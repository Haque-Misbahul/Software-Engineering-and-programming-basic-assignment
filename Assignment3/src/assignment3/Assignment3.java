
package assignment3;


public class Assignment3 {

    public static int lenghtOfLongestSubstring(String s)
    {
        int result = 0 ; 
        int length = s.length();
                        
                
        for(int i = 0; i < length; i++)
        {
            int count = 0;
            int[] frequency = new int[255]; 
            for(int j = i; j < length; j++)
            {
                int asci = s.charAt(j);
                frequency[asci]++;
                count++;
                if(frequency[asci] > 1)
                {
                    count--;
                    break;
                }
            }
            
            if(count > result)
            {
                result  = count;
            }       
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        
        int result  = lenghtOfLongestSubstring("wZkaAzZew");
        System.out.println(result);
        result  = lenghtOfLongestSubstring("");
        System.out.println(result);
 
 
        
    }
        
        
    
}

