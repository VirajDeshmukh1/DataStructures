class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> al=new ArrayList<>();
        int num=1;
        
        while(num<=n){
            if(num%3==0 && num%5!=0){
                String s=Integer.toString(num);
                al.add("Fizz");
                //al.add(s);
                num++;
            } else if(num%5==0 & num%3!=0){
                String s=Integer.toString(num);
                al.add("Buzz");
                //al.add(s);
                num++;
            } else if(num%3==0 && num%5==0){
                String s=Integer.toString(num);
                al.add("FizzBuzz");
                //al.add(s);
                num++;
            } else{
                String s=Integer.toString(num);
                al.add(s);
                num++;
            }
        }
        return al;
    }
}