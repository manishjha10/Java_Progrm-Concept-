public class Main{
  public static String removeDuplicate(String s) {
    StringBuilder sb  = new StringBuilder() ; 

   for(char ch :  s.toCharArray()){
     int len = sb.length() ;
     if(len > 0 && sb.charAt(len-1) == ch){
       sb.deleteCharAt(len - 1) ;
     }
     else{
       sb.append(ch);
     }
   }

  return sb.toString() ;
  }
}
