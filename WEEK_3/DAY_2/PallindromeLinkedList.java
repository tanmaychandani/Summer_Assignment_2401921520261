class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode fwd=null;
        ListNode prev=null;
        while(curr!=null)
        {
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null)return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverse(head2);
        slow=head;
        fast=head2;
        while(fast!=null)
        {
            if(slow.val!=fast.val)return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}
