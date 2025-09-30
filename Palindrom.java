/*
//////////////////////////////////////////////////////////////////////
        Program: Palindrom string
        Input: madam level hello nayan pune
        output:madam level nayan

//////////////////////////////////////////////////////////////////////
*/
import java.util.*;
class Palindrom
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        if(str.equals(new String(sb)))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}