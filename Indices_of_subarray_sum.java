public class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list  = new ArrayList<Integer>() ;
        int n  =  arr.length ;
        int sum = 0 , start  = 0 ;
        
        for(int  i=0 ;i<n ;i++){
            
            sum +=  arr[i] ; //  expand the window size 
            
            while(sum > target && start  <=  i) {
               sum -= arr[start] ;  // shrink the window size  ;
               start ++;
            }
            if(sum  ==  target){
                list.add(start+1) ;
                list.add(i+1) ; //  1-based indices  
              
                 return list  ;
            }
            
        }
        if(list.size() == 0) list.add(-1) ; 
        return list  ;
    }
}
