
package assignment4;


public class Task2 
{
     public static int[] search(int[][] array,int size,int number)
    {
        int []position=new int[2];
        int count=0;
       
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(array[i][j]==number)
                {
                position[0]=i;
                position[1]=j; 
                count++;
                break;
                }               
            }
            if(count==1)
                break;
        }  
        return position;      
    }
    
    /*
     public static void main(String[] args) {
        int array[][]= {{1,2,2},
                        {2,4,7},
                        {2,7,2}};
        int number=2;
        int size=3;
        int [] answer = 
                search(array,size,number);
        
        System.out.println(number+" is found at: ("+answer[0]+","+answer[1]+")");
    }*/
}
