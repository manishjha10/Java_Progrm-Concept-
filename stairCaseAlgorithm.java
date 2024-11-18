import java.util.* ;
public class Stair_Case_Algorithm {
    static boolean matSearch(int[][] mat , int x ){
       int rows =  mat.length ;
       int cols =  mat[0].length ;

       int row = 0 ; //  at the start point of array
        int col =  cols - 1 ; //  at the last col of the array
        while(rows > row && col >= 0) {

            if(mat[row][col] == x) return true  ;

            else if(mat[row][col] > x){  //  search from smaller to decrease the col
                col -- ;
            }
            else {
                row ++ ; // increases the col
            }
        }
        return false  ;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;

        int r =  sc.nextInt() ;
        int c =  sc.nextInt() ;


        int[][] mat = new int[r][c] ;
        for(int i = 0  ; i < r ; i++) {
            for(int j = 0 ; j < c ;j++) {
                mat[i][j] = sc.nextInt() ;
            }
        }
        int x = sc.nextInt() ;

         boolean ans =  matSearch(mat ,x) ;
        if(ans ==  true){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
