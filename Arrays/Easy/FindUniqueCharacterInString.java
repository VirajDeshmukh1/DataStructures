 HashMap<Character, Integer> hm=new HashMap<>();
class Solution {
    public int firstUniqChar(String s) 
    {        
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                //
                int x=hm.get(s.charAt(i));
                x=x+1;
                hm.put(s.charAt(i),x);
            }
               else{
                   hm.put(s.charAt(i),1);
               }
        }             
       System.out.println(hm);

        for(int i=0;i<s.length();i++){
            System.out.println(i);
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}