 class Solution {
    public int singleNumber(int[] nums) 
    {
	Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length-1;i+=2)
        {
            for(int j=0;j<nums.length;j+=2)
            {
                if(nums[i]==nums[j])
                {
                    a=0;
                }
                else
                    a=nums[i];
            }
        }
        return a;
    }
}