
package sepb_algae;

/**
 *
 * @author misbahulhaque
 */
public class AlgaeSurvival {
    
    int row, column;
    
    public AlgaeSurvival(int row, int column){
        this.row=row;
        this.column=column;
        int [][] grid=new int [row][column];
        for(int i=0;i<=row;i++) 
        {
            for(int j=0;j<=column;j++)
            {
                grid[i][j]=0;
            }
        }
    }

    public static void setLivingCell(int row, int column)
    {
        
    }
    public static int countLivingNeighbours(int row, int column)
    {
        int num_of_neighbours=0;
        
        
        return num_of_neighbours;
    }
    public static void computerNextGeneration()
    {
        
    }
    
    public static void main(String[] args) {

      
        
        
        
    }
    
}
