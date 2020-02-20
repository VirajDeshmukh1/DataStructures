class Solution {
    public boolean isPalindrome(String s) {
s=s.replaceAll("\\W","").toLowerCase();
        System.out.println(s);
        
        int start=0;
        int end=s.length()-1;
        
        if(s.length()==1)
            return true;
        
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            } else
                return false;
        }
        
        return true;
    }
}
