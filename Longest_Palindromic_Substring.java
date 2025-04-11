class Solution { 
    public  boolean check(String s){
       
        if(s.length() == 1) return false ;

        int i  = 0 ;
        int j = s.length()-1;
        
        
        while(i < j){
         if(s.charAt(i) == s.charAt(j)){
            i++;
            j--;
         }
         else if(s.charAt(i) != s.charAt(j)){
            return false ;
         }
        } 
        return true;
    }

    public String longestPalindrome(String s){
         if(s.length() == 1) return s ;

        int res = 0;
        int ans = 0; 
        int maxi = 0; 

        ArrayList<String> l = new ArrayList<>() ;
        
        boolean flag  = false ;
      
        for(int i=0 ;i<s.length() ;i++)
        { 
            for(int j=(i+1); j<=s.length(); j++){ 
                
                if(check(s.substring(i , j))){ 
                    
                    String str  = s.substring(i,j);  
                     ans = str.length() ;
                   

                    if(maxi < ans){          // for  greater length of pallindromic string .
                        maxi = ans ;
                        l.clear();
                        l.add(str);
                       
                    }
                    else if(ans  == maxi){    // equal then also add .
                       l.add(str);
                    }

                } 
            }
        }
         
        if(l.size() > 0){
        String temp = "";
        temp = l.get(0); 
        return temp ;
        }
            
        String res1 = "";
        res1 += s.charAt(0) ;
        return res1 ; 

    }
}
