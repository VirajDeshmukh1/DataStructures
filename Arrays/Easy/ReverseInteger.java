class Solution {
    public int reverse(int x) {
        long num=0; 
        while(x>0)        
        {
            int rem=x%10;
            num=num*10 + rem;
            if(num>Integer.MAX_VALUE)
                return 0;
            else
                x=x/10;
        }
        while(x<0)
        {
            int rem=x%10;
            num=num*10+rem;
            if(num<Integer.MIN_VALUE)
                return 0;
            else
                x=x/10;
        }
        return (int)num;
    }
}