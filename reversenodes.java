class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
        this.val = x;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class reversenodes {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        // reversenodes rn = new reversenodes();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth= new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;
        
        
        ListNode dummy = new ListNode(0,head);
        ListNode grpprev = dummy;

        int k =

        while(true){

        }
        
        // ListNode ptr1 = head;
        // while(ptr1!=null){
        //     System.out.println(ptr1.val);
        //     ptr1=ptr1.next;
        // }

    }
}
