class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      public String toString(){
      	return "Node : " + this.val;
      }
}


public class MiddleOfLinkedList{
	public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if(fast.next == null){
                break;
            }else{
                fast = fast.next;
            }
        }
        
        return slow;
    }

    public static void main(String[] args) {
    	ListNode head = new ListNode(1);
    	ListNode current = head;
    	for (int i = 2; i < 8; i++ ) {
    		current.next= new ListNode(i);
    		current = current.next;
    	}

    	System.out.print(middleNode(head));

    }
}