/*
/////////////////////////////////////////////////////////////////////////////

Program Name : AnagramString.java
Input: Hello
Output: loleh

////////////////////////////////////////////////////////////////////////////
*/
import java.util.*;

class StringX
{
    public static boolean CheckAnagram(String str1, String str2)
    {
        boolean bFlag = true;
        int i = 0;

        if(str1.length() != str2.length())
        {
            return false;
        }

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int Count1[] = new int[26];
        int Count2[] = new int[26];

        for(i = 0;i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i]< 'z'))
            {
                Count1[Arr[i] - 'a']++;
            }
            if((Brr[i] >= 'a') && (Brr[i] <= 'z'))
            {
                Count2[Brr[i] - 'a']++;
            }
        }

        for(i = 0 ;i<26;i++)
        {
            if(Count1[i] != Count2[i])
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }
}
class AnagramString
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first String:");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second String:");
        String str2 = sobj.nextLine();

        bRet = StringX.CheckAnagram(str1,str2);

        if(bRet == true)
        {
            System.out.println("Anagram String:");
        }
        else
        {
            System.out.println("Not Anagram String:");
        }
    }
}