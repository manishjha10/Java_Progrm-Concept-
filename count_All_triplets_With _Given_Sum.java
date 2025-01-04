
class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n  = arr.length  ; 
        int count  = 0 ;
        for(int  i = 0 ;i < n-2 ;i++){  //  n-2 three triplet sum  
        //  two pointer approch  
        int left  = i+1 , right  = n-1 ;
        
        while(left  < right){  //  array sorted apply binary serch 
        int sum  = arr[left] + arr[right] + arr[i] ;
        
        if(sum  > target){
            right -- ;
        }
        else if(sum  < target){
            left ++ ;
        }
        else if(sum  == target){  //  if sum equal to target the duplicates are also present we count all the possible pairs
        //  case 1 with left and right
        //  count the left frequences  
        
        int ele1  = arr[left] ;    
        int cnt1 = 0 ;   //  for frequency count 
        //  left frequecy count
        while(left <= right && arr[left] ==  ele1){
            left ++ ;
            cnt1 ++ ;
        }
        //  right frequency count 
        int ele2 = arr[right];
        int cnt2 = 0 ;
        while(left <= right && arr[right] == ele2){
            right  -- ;
            cnt2 ++ ;
        }
        
        // case 2 if left and right ele are sume so select two in those pairs  nC2  
        if(ele1 == ele2)
        {
        count  += (cnt1 * (cnt1-1) ) / 2 ;
        } 
        else      //  for different simple cnt1*cnt2 pairs 
        { 
          count += cnt1 * cnt2 ;  
        }
  
        }
            
        }
            
        } 
        return count  ;
    }
}
