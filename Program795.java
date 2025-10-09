/*  
    Array of n element
    pair element

    i/p : 7   2   9   7   3   8   2   9   3

    o/p : 8
    output not proper
*/

import java.util.*;

class Program795
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {7,2,9,7,3,8,2,9,3};

        boolean bFlag = true;
        int i = 0, j = 0, iFound = 0;

        //arr lenth 9
        // 0 1 2 3 4 5 6 7 8
        //7,2,9,7,3,8,2,9,3


        for(i = 0;i < Arr.length;i++)
        {
            bFlag = false;

            for(j = i + 1;j< Arr.length;j++)
            {
                if(Arr[i] == Arr[j])
                {
                    bFlag =  true;
                    break;
                }
            }

            if(bFlag == false)
            {
                iFound = Arr[i];
            }
        }
        System.out.println("Non Paired Element is :"+iFound);
    }
}