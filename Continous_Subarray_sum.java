class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
       int psum  = 0 ;
        Map<Integer,Integer> mp = new HashMap<>() ;
        mp.put(0,-1) ; //  empty mp 


        for(int  i = 0 ; i <  nums.length  ;i++){
             psum += nums[i] ;   // psum 
            int mod = psum % k ;    // we check the multiple of k 
           
            if(mp.containsKey(mod)) {
                if(i - mp.get(mod) > 1){   //  occurence at leat 2 
                    return true  ;
                }
            }
            else {
                mp.put(mod , i) ;    //  not present then put the mod with there index of cuuent element so further check the values in mp 
            }
        }


        return false ;}
}
