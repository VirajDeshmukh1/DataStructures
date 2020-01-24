
public class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        
        for(int j : nums)
        {
            System.out.println(j);
        }
        
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
        
    }
}