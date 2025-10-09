/*  segregate prob statement
    Array of n element
    shifted element
    i/p : 0    1   0   1   0   0   1

    o/p :  0     0     0     0       1       1       1   
    
     complexity O(2N)
*/

import java.util.*;

class Program797
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {0,1,0,1,0,0,0,1};

        int iSum = 0;

        for(int no : Arr)
        {
            iSum = iSum + no;

        }
        int i = 0;

        for(i = 0; i < Arr.length - iSum;i++)
        {
            Arr[i] = 0;

        }
        for(i = Arr.length - iSum; i < Arr.length; i++)
        {
            Arr[i] = 1;
        }
        System.out.println("Seggregated Array is :");

        for(i = 0;i < Arr.length;i++)
        {
            System.out.println(Arr[i]+"\t");
        }
        System.out.println();
    }
}