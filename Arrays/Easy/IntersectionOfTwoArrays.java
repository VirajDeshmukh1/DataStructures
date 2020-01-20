class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashMap <Integer,Integer> hm=new HashMap<>();
        HashMap <Integer,Integer>hashmap=new HashMap<>();
        HashMap <Integer,Integer>hm2=new HashMap<>();
        
        int a=0;
        for(int i=0;i<nums1.length;i++){
            hm.put(a,nums1[i]);
            a++;
        }
        int b=0;
        for(int i=0;i<nums2.length;i++){
            hashmap.put(b,nums2[i]);
            b++;
        }
    
        int c=0;
        for(int x:hm.values()){
            if(hashmap.containsValue(x)){
                if(hm2.containsValue(x)!=true){
                hm2.put(c,x);
                c++;
                }
            }
        }
        int ar[]=new int[hm2.size()];
        int i=0;
       for(Integer x:hm2.values()){
           ar[i]=x;
           i++;
       }
        return ar;
    }
}
