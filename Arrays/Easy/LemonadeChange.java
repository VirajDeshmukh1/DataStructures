class Solution {
    public boolean lemonadeChange(int[] bills) {
//         int total=0;
        
//         if(bills[0]>5)
//             return false;
//         for(int i=0;i<bills.length;i++){
//             if(bills[i]==5)
//                 total=total+5;
//             else if(bills[i]>5){
//                     //if(total>bills[i]-5){
//                         total=total+bills[i];
//                         total=total-(bills[i]-5);
//                     //}
//                  if(total<=0)
//                     return false;
//             }
//         }
//         return true;
        
        //int total=0;
        int five=0;
        int ten=0;
        //int twenty=0;
        
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                //total=total+5;
                five++;
            } else if(bills[i]==10 && five>0){
                // total=total+10;
                // total=total-5;
                five--;
                ten++;
            } else if(bills[i]==20 && five>0 && ten>0){
                // total=total+20;
                // total=total-15;
                ten--;
                five--;
                //twenty++;
            } else if(bills[i]==20 && ten==0 && five>2){
                // total=total+20;
                // total=total-15;
                five=five-3;
            }
            else
                return false;
        }
        // if(total<=0)
        //     return false;
        return true;    }
}