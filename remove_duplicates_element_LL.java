class Solution {
Node remove_duplicates_element(Node head , int val ){ 

ListNode dummy  =  new Node(100) ;
dummy.next  = head  ;  //  through this we travel the ll 
ListNode temp = dummy ; 

while(temp.next != null){

if(temp.next.val ==  val)
{
temp.next =  temp.next.next ; //  temp is on the dummy hat is  100 
}
else
{
temp=temp.next ;
}
} 

return dummy.next ; 

}
}
