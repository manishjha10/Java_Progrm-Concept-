public class Main{ 
  static int longestSubarray(int[]  arr, int k)
  {
   int n = arr.length ;
    int max = 0 , psum = 0;
    Map<Integer, Integer> mp = new HashMap<>() ; 

    mp.put(0,-1) ; // for the 1 length should be zero.[map not empty]
    for(int i=0 ;i<n ;i++)
      {
       psum += arr[i];

        if(mp.containsKey(psum - k))
        {
          max  = Math.max(max , i - mp.get(psum-k));
        }
        if(!mp.containsKey(psum)
            {
            mp.put(psum ,i)
            }
    } 
   return max;
  }
  public static void main(String[]  args){
    int[] arr = {10,5,2,7,1,-10};
    int k=15;
    System.out.println(longestSub(arr, k));
  }
}
