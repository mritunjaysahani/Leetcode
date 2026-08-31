class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head1 = list1, head2 = list2;

        ListNode ans = new ListNode(-1);
        ListNode temp = ans;

        while(head1 != null && head2 != null) {

            if(head1.val > head2.val) {
                ans.next = head2;
                head2 = head2.next;
            }
            else if(head2.val > head1.val) {
                ans.next = head1;
                head1 = head1.next;
            }
            else {
                ans.next = head1;
                head1 = head1.next;

                ans = ans.next;

                ans.next = head2;
                head2 = head2.next;
            }

            ans = ans.next;
        }

        while(head1 != null) {
            ans.next = head1;
            ans = ans.next;
            head1 = head1.next;
        }

        while(head2 != null) {
            ans.next = head2;
            ans = ans.next;
            head2 = head2.next;
        }

        return temp.next;
    }
}