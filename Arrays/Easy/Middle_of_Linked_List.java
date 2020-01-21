class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode n=head;
        while(n.next!=null){
            count++;
            n=n.next;
        }
        //System.out.println(count);
        int mid=count/2;
        ListNode m=head;
        
        if(count%2==0){
            for(int i=0;i<mid;i++){
            m=m.next;
        }
    }else{
            for(int i=0;i<mid+1;i++){
                m=m.next;
            }
        }
       
        
        return m;
    }
}