public class MJ {
  public static int maxMininmum_Distance(int[]  stalls , int k) {
    Arrays.sort(stalls) ;
    int n =  stalss.length  , ans  = 0 ;
    int st  = 1 , end =  stalls[n-1] -stalls[0]; 
   while(st <= end) {
     int mid  = st +(end-st) / 2 ;
     int count  = 1 , pos =  stalls[0];
     for(int  i = 0 ;i < n ;i ++) {
       if(mid + pod <= stalls[i]){
         count  ++ ;
         pos =  stalls[i] ;
       }
     }
     if(count < k ){
       end  =  mid  -1 ; //  for a minimim mistance 
     }
     else {
       ans =  mid  ;
       st  = mid  + 1 ;  //  we need a maximum possible minimum distance 
     }
   }
    return ans  
  }
}
