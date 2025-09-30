/*
/////////////////////////////////////////////////////////////////
Program Name : Maximum time occured character show.java
        input: snehal shitkal
        output: s: 2
*/

import java.util.*;
class UniqueCharFrequency
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.replaceAll(" ","");
        System.out.println(str);
        
        HashMap<Character,Integer> hobj = new HashMap<Character,Integer>();

        char Arr[] = str.toCharArray();

        int Frequncy = 0;
        for(char ch : Arr)              //already exist char
        {
            if(hobj.containsKey(ch))
            {
                Frequncy = hobj.get(ch);
                hobj.put(ch,Frequncy+1);
            }
            else
            {
                hobj.put(ch,1);
            }
        }
                int iMax = 0;
                char cMax = '\0';

            for(char ch : hobj.keySet())
            {
                if(iMax < hobj.get(ch))
                {
                    iMax = hobj.get(ch);
                    cMax = ch;
                }
            }

       System.out.println("Maximum Occured : "+cMax+" with frequeency: "+iMax);
    }
}