/*  segregate prob statement
    Array of n element
    shifted element
    i/p : 0    1   0   1   0   0   1

    o/p :  0     0     0     0       1       1       1   
    
     complexity O(N)
*/

import java.util.*;

class Program798
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {0,1,0,1,0,0,0,1};
        int i = 0;
        int iStart = 0;
        int  iEnd = Arr.length - 1;

        while(iStart < iEnd)
        {
            if(Arr[iStart] == 0)
            {
                iStart++;
            }
            else if(Arr[iEnd] == 1)
            {
                iEnd--;
            }
            else
            {

                Arr[iStart] = 0;
                Arr[iEnd] = 1;

                iStart++;
                iEnd--;
            }
        }
      
        System.out.println("Seggregated Array is :");

        for(i = 0; i < Arr.length;i++)
        {
            System.out.println(Arr[i]+"\t");
        }
        System.out.println();
    }
}