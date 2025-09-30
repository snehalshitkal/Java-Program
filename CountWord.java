/*
//////////////////////////////////////////////////////
        Program : Count number of word 
        input:   india is my country
        output:  4
 /////////////////////////////////////////////////////
*/

import java.util.*;

class CountWord
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        str = str.trim();

        int Count = 0, i = 0, j = 0;
        boolean bFlag = false;

        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];

        for( i =0 ;i<Arr.length;i++)
        {
            if(Arr[i] != ' ')
            {
                Brr[j] = Arr[i];
                j++;
                bFlag = false;
            }
            else if(Arr[i] == ' ')
            {
                if(bFlag == false)
                {
                    Brr[j] = ' ';
                    j++;
                    bFlag = true;
                    Count++;   
                }

            }
        }
        System.out.println("Number of Word are:"+(Count+1));

    }
}