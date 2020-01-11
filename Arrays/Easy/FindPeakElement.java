class Solution {
    public int findPeakElement(int[] nums) {
        int peak=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(peak<nums[i])
                peak=nums[i];
        }
        for(int i=0;i<nums[i];i++)
        {
            if(peak==nums[i])
                return i;
        }
        return 0;
    }
}