class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                //System.out.println(nums[i]);
                return i;
            }
        }
        
        return nums[nums.length-1] + 1;
    }
}
    
