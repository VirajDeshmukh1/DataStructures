class Solution {
    public void rotate(int[] nums, int k) {
        int lastelement=nums[nums.length-1];
        int ar[]=new int[nums.length];
        if(k>0)
        {
            k--;
            for(int i=0;i<nums.length-1;i++)
            {
                ar[i+1]=nums[i];
            }
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=ar[i];
            }
            nums[0]=lastelement;
        }
        if(k>0)
        {
            rotate(nums,k);
        }
    }
}