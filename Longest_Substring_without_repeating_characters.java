class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int ans=0, i=0, j=0;
        while(i<s.length() && j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j++));
                ans=Math.max(ans, j-i);
            } else {
                hs.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}