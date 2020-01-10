class Solution {
    public int removeDuplicates(int[] nums) 
    {
     int i=0,k=1,j=0;
        
         for(i=0;i<nums.length-1;i++)
         {
             if(nums[i]!=nums[k])
             {
                 nums[j] = nums[i];
                 j++;
             }
             k++;
         }
        
        if(nums.length>0)
        {
             nums[j] = nums[i];
             j++;
         }
         return j;  
    }
}