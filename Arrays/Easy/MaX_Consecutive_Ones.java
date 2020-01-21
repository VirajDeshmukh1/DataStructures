class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count=0;
        int max=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count > max)
            {
                max=count;
            }
        }
    return max;
    }
}
