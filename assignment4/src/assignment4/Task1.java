
package assignment4;

public class Task1 {
    public static int productDiagonals(int[][] array,int size)
    {
  
        
        int answer=1;
     
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==j)
                {
                answer=answer * array[i][j];                   
                }              
                if(i+j==size-1)
                {
                answer=answer * array[i][j];
                }
            }
        } 
        if(size%2==1)
        {
            int temp;
            temp = (size-1)/2;
            answer=answer/array[temp][temp];
        }      
        return answer;       
    }
    
    public static void main(String[] args) {
        int array[][]= {{1,2,3,4,5},
                        {5,6,7,8,6},
                        {9,7,4,2,7},
                        {2,2,2,1,8},
                        {2,4,2,1,1}};
        int answer = productDiagonals(array, 5);
        System.out.println(answer);
    } 
}
