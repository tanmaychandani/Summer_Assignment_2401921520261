lass Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp=head;
        if(temp==slow)return temp.next;;
        while(temp.next!=slow)
        {
            temp=temp.next;
        }
        temp.next=slow.next;
        return head;
    }
}
