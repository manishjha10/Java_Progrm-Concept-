publc class Main {
public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int rows =  mat.length ; 
        int cols =  mat[0].length  ;
        
        int st  = 0  , end  =  rows*cols- 1 ; 
        
        
        while(st <= end) { 
            int mid  = st + (end - st)/2 ;
            int row = mid / cols ;
            int col  = mid % cols ; 
            
            if(mat[row][col] == x) return true  ;
            else if(mat[row][col] > x){
                end = mid - 1;
            }
            else {
                st =  mid + 1 ;
            }
        }
        return false ;
        
    }
}
