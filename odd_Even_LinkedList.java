class Solution { 
  //Arrange first all even indices and after the odd indices and return the even node .
    public ListNode oddEvenList(ListNode head) {
        ListNode even  = new ListNode(100) ;//  for attachement of even indices to the head .
        ListNode odd  = new ListNode(200) ;//  for attachement of odd indices to the head .
        ListNode  temp = head  ;
        ListNode temp1 = even  ;
        ListNode  temp2 = odd ; 

        int count  = 0; //  for iterate over the indices  
        while(temp != null){
        if(count % 2 == 0){   // indices is even
        even.next  =  temp  ;
        even =  temp  ;   //  even node also point to the same point where temp is point
        }
        else{
            odd.next  = temp ;
            odd = temp;
        }
        count  ++ ;
        temp = temp.next  ;
        }
    
       odd.next  = null ; //  for finishing the odd node  and add to the null in last
       even.next  = temp2.next ; //  attach the even node to the odd node by one next 

       return temp1.next ; //  return the even node  

    }
}
