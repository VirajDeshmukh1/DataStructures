class Solution {
    public int[][] flipAndInvertImage(int[][] A) 
    {
        int ar[][]=new int[A.length][A[0].length];
        
      
        for(int i=0;i<A.length;i++)
        {
              int x=0;
           for(int j=A[0].length-1;j>=0;j--)
           {
             if(x<A.length)
             {
               ar[i][x]=A[i][j];
               x++;
             }
             // else
             // {
             //     x=0;
             // }
           }
        }  
        
//         for(int m=0;m<ar.length;m++)
//         {
//             for(int n=0;n<ar[0].length;n++)
//             {
//                  System.out.print(ar[m][n]);
//             }
//             System.out.println();
//         }
        
        for(int m=0;m<ar.length;m++)
        {
            for(int n=0;n<ar[0].length;n++)
            {
            // System.out.print(ar[m][n]);
              if(ar[m][n]==1)
              {
                  ar[m][n]=0;
                }
                else
                {
                    ar[m][n]=1;
                }
            }
           //System.out.println();
        }
        return ar;
    }
}