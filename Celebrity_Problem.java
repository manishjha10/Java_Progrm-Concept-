//  Celebrity Problem.
public class Main{ 
    static boolean knows(int[][] mat, int a , int b){
        if(mat[a][b] == 1){ 
            return true ;    // knows 
        }
        else{
            return false ; //  no knows 
        }
    }
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        Stack<Integer> st = new Stack<Integer>() ;
        
        //  Step1  put all elements in the stack .
        for(int i = 0 ; i < mat.length ;i++){
            st.push(i);
        }
        
        // Step2 push elements till the stack size is greater then  1 
        while(st.size() > 1){
            
            int a = st.pop(); 
             
            int b = st.pop();  
            
            if(knows(mat , a, b))
            {      //  for each rows and columns check.
              st.push(b);
            }
            else
            {
                st.push(a);    //  b knows a 
            }
            
        } 
        int ans =  st.peek();
        
        // step3  vaerify the last element vo poyrbtial celbrity hai ke hai.
        
        int zeroCount = 0;
        
        for(int i=0; i<mat.length ;i++){
            if(mat[ans][i] == 0){
                zeroCount ++ ;  //  celebrity no one knows
            }
        }
        
        // all zeros 
        if(zeroCount != mat.length){
            return -1 ;
        } 
        
        
        //  column check .
        int oneCount = 0;
        for(int i=0 ;i<mat.length;i++){
            if(mat[i][ans] == 1) //  everyone should knows the celebrity.
            {
                oneCount ++;
            }
        } 
        if(oneCount != mat.length-1){   // mat.length-1  becuase except the diagonal  
            return -1 ;          
        }
        
        return ans ;
    }
}
