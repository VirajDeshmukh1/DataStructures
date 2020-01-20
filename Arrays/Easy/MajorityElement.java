class Solution {
    public int majorityElement(int[] nums) 
    {
        int mean=nums.length/2;
        
        for(int i: nums)
        {
            int count=0;
            for(int j:nums)
            {
                if(i==j)
                {
                    count++;
                }
            }
            if(count >mean)
            {
                return i;
            }
        }
        return -1;
    }
}