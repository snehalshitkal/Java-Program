/*
//////////////////////////////////////////////////////////////////
        Program :   Display Largest word and its length
        Input: india is my Country
        output : Country  length - 7

///////////////////////////////////////////////////////////////////
*/ 
import java.util.*;
class LargestWordLen
{
    public static void main(String A[])
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str  = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");
        
        int iMax = 0;

        String Max = null;
        for(i = 0; i< Tokens.length;i++)
        {
            if(Tokens[i].length() > iMax )
            {
                iMax = Tokens[i].length();
                Max = Tokens[i];
            }
        }
        System.out.println("Largest word: "+Max+ " : "+iMax);

    }
}