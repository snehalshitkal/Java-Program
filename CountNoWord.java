/*
////////////////////////////////////////////////
        Program: Count repeat Number of word
Input: india hello india pune karad pune hello
output: india 2
        hello 2
        pune 2
        karad 1
Useed HashMap
//////////////////////////////////////////////////////
 */
import java.util.*;
class CountNoWord
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        HashMap<String,Integer> hobj = new HashMap<String,Integer>();

        for(String s : Tokens)
        {
            if(hobj.containsKey(s))
            {
                hobj.put(s,hobj.get(s)+1);
            }
            else
            {
                hobj.put(s,1);
            }
        }

        for(String s : hobj.keySet())
        {
            System.out.println(s+" : "+hobj.get(s));
        }
    }
}