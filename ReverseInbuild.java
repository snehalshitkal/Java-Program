/*
/////////////////////////////////////////////////////
    Program : Accept string and Reverse.
    input:  india is my country
    output: yrtnuoc ym si aidni
/////////////////////////////////////////////////////
 */

import java.util.*;
class ReverseInbuild
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        StringBuilder sbobj = new StringBuilder(str);
        sbobj.reverse();

        System.out.println(sbobj);


    }
}