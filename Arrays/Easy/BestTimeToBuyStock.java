class Solution {
    public int maxProfit(int[] prices) 
    {
        int a=0;
        for(int i=0;i<prices.length-1;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                int b=prices[j]-prices[i];
                if(b>a)
                {
                    a=b;;
                }
            }
        }
        return a;
    }
}