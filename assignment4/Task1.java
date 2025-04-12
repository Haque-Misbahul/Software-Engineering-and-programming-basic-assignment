package assignment4;

public class Task1{
	//Method required

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

}