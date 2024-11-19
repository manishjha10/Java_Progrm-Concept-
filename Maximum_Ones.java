public class Main {
public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int rows =  Mat.length  ;
        int cols =  Mat[0].length  ;
        
        int row = 0 , col = cols -1  , len = -1;
        
        while(rows > row  && col >= 0){ 
            
            if(Mat[row][col] < 1){
               row ++  ;
              
            }
            else {
                
                 col -- ;
                 len = row  ;
            }
                
            }
        
        return len ;
    }
}
