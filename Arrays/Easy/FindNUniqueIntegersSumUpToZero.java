class Solution {
    public int[] sumZero(int n) {
       int ar[]=new int[n];
        int a=n-1;
        int b=0;
        for(int i=0;i<ar.length;i++){
           if(i<ar.length-1){
                ar[i]=a;
                b=b+a;
                a--;
           }
            else{
                b=b*(-1);
                //System.out.println(b);
                ar[i]=b;
            }
        }
        Arrays.sort(ar);
        return ar;
    }
}