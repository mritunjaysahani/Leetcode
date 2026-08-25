class Solution {
    public int getDecimalValue(ListNode head) {
        int num=0;
        while(head!=null){
            int data=head.val;
            num=(num<<1)|data;
            head=head.next;
        }
        return num;
    }
}