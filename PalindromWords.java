/*
//////////////////////////////////////////////////////////////////////
        Program: Palindrom string
        Input: madam level hello nayan pune
        output:madam level nayan

//////////////////////////////////////////////////////////////////////
*/
import java.util.*;
class PalindromWords
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        StringBuilder sb = null;

        for(String s : Tokens)
        {
            sb = new StringBuilder(s);
            sb.reverse();

           if(s.equals(new String (sb)))
           {
            System.out.println(s);
           }
        }


    }
}