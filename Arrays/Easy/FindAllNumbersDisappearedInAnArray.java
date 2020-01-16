class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List <Integer> li=new ArrayList<Integer>();
        int count=0;
        Arrays.sort(nums);
        
        if(nums.length==0)
            return li;
        
        if(nums[0]!=1)
        {
            for(int i=1;i<nums[0];i++)
            {
                li.add(i);
            }
        }
        if(nums[nums.length-1]!=nums.length)
        {
            for(int i=nums.length;i>nums[nums.length-1];i--)
                
                li.add(i);
            System.out.println("last");
        }
        
        for(int i=0;i<nums.length-1;i++)
        {System.out.println("middle");
            if(nums[i+1]-nums[i]>1)
                count++;
            int n=nums[i+1]-nums[i];
            for(int k=1;k<n;k++)
            {
             li.add(nums[i]+k);
            }
        }
        
       /* if(nums.length!=nums[nums.length-1])
        {
            for(int i=nums.length;i>nums[nums.length-1];i--)
            {
                li.add(i);
            }
        }*/
        return li;
    }
}