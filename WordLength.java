/*
/////////////////////////////////////////////////////////////////
            Program: Count length of Word
            Input: snehal rohit shitkal
            output: snehal: 6
                    rohit: 5
                    shitkal:7
            Algorithm:
                trim()
                replaceAll("\\s+"," ")
                Tokens split(" ")
/////////////////////////////////////////////////////////////////
 */

import java.util.*;
class wordLength
{
    public static void main(String A[])
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");
        
        for(i = 0 ; i < Tokens.length ; i++)
        {
            System.out.println(Tokens[i]+ " : "+Tokens[i].length());
        }

    }
}