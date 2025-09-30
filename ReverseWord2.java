/*
///////////////////////////////////////////////////////////////
    Program: Enter the string.Reverse the each word of string 
            in new String and Display new string
    input:  india is my country
    output: aidni si ym yrtnuoc

////////////////////////////////////////////////////////////////
 */
import java.util.*;
class ReverseWord2
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

        StringBuilder newstr = new StringBuilder();
        for(String s : Tokens)
        {
            sb = new StringBuilder(s);
            newstr.append(sb.reverse());
            newstr.append(" ");

        }
        String finalstr = new String(newstr);
        System.out.println(finalstr.trim());
    }
}