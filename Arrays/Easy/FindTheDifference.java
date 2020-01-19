class Solution {
    public char findTheDifference(String s, String t) {
	char ar1[]=s.toCharArray();
        char ar2[]=t.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]!=ar2[i])
                return ar2[i];
        }
        return ar2[ar2.length-1];
    }
}