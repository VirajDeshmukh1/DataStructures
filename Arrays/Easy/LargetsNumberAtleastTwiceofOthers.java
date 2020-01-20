class Solution {
    public int dominantIndex(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[a]){
                a=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=a && nums[a]<2*nums[i]){
                return -1;   
            }
        }
        
        return a;
    }
}