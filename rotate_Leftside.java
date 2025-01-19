
class Main {
    public Node rotate(Node head, int k) {
        // add code here 
        int count = 0  , d = 0;
        Node temp =  head;         //  calaculating the size 
        while(temp != null) {
             count ++ ;
              temp = temp.next  ;
         } 
         
        //  handle edge case  
        if(head ==  null ||  head .next == null) return head  ; //  no need to rotate  
        
        //  handle the large test cases when k is larger 
        if(k == count) return head ;
        if(k > count){
            d = k % count ;
        }
        else{
            d = k  ;
        } 
        
        
        //  finding the tail.
        Node tail  = head ;
        while(tail.next  != null){
            tail = tail.next ;
        }
        
        //  remove the head and attachet to the last till d times 
        for(int i=0 ;i<d ;i++) { 
            
            Node h  = head;
            Node set  = h.next ; //  head is move 
            head = set ; 
            
            // set the head to the tail 
            tail.next  = h ;
            h.next = null ;
            tail = h ;
            
        }
        
        return head  ;
    }
}
