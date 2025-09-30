/*
///////////////////////////////////////////////////////////////
    Program: Enter the string.Reverse the each word of string
    input:  india is my country
    output: aidni si ym yrtnuoc

////////////////////////////////////////////////////////////////
 */
import java.util.*;
class ReverseWord
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        StringBuilder sbobj = null;

        for(String s : Tokens)
        {
            sbobj = new StringBuilder(s);
            System.out.println(sbobj.reverse());
        }



    }
}