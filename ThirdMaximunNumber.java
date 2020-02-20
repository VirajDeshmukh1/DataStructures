class Solution {
    public int thirdMax(int[] nums) 
    {
        int count=0;
        int a=0;
        Arrays.sort(nums);
        
        for(int x:nums)
            System.out.println(x);
        
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
                count++;
            if(count==2)
            {
                return nums[i-1];
            }
                
        }
    
        if(nums.length<3 || count!=2)
             a=nums[nums.length-1];
        return a;
    }
}