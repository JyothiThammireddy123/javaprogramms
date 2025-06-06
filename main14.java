class Solution {
    public boolean isPalindrome(ListNode head) {
        stack<integer>s=new stack<>();
        ListNode c=head;
        while(c!=null)
        {
            s.push(c.val);
            c=c.next;
        }
        ListNode i=head;
        while(i!=null)
        {
            int t=s.pop();
            if(t!=i.val)
            return false;
            i=i.next;
        }
        return true;
    }    
}