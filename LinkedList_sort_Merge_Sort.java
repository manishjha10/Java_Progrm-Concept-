
class Solution { 
    public ListNode merge(ListNode left , ListNode right){
        ListNode temp = new ListNode(0) ; 
        ListNode temp1 = temp ;

        while(left != null && right != null){ 

            if(left.val <= right.val){
              temp.next = left ;
              temp = left ;
              left = left.next ;
            }
            else{
                temp.next = right ;
                temp = right;
                right = right .next ;
            }
        } 
        while(left != null){
            temp.next  = left ;
            temp = left ;
            left  = left.next ;
        }
        while(right != null) {
            temp.next = right;
            temp = right  ;
            right =  right.next  ;
        }
        return temp1.next ;
    } 
    
    public ListNode mergeSort(ListNode head){

        if(head == null || head.next == null) return head ;   // Base Condition 

        ListNode slow  = head ;
        ListNode fast = head.next ;

        while(fast != null  && fast.next != null){
            slow = slow.next ; 
            fast = fast.next.next ;
        } 

        
        ListNode mid  = slow.next ;
        slow.next =  null ; //  left half 

        ListNode left  = mergeSort(head) ; //  start to mid 
        ListNode right =  mergeSort(mid);  //  right of half

        // merge 
       return  merge(left , right) ;

    } 

    public ListNode sortList(ListNode head) {
       return mergeSort(head) ;
    }
}
