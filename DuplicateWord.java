/*
/////////////////////////////////////////////////////////////////
    Program :   Display only Duplicated Word
    Input:      India pune India  karad satara pune
    Output:     India,pune
////////////////////////////////////////////////////////////////
*/


import java.util.*;
class DuplicateWord
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

            if(hobj.get(s)>1)
            {
                System.out.println(s);
            }
        }
    }
}