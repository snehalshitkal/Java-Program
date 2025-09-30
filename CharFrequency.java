/*
/////////////////////////////////////////////////////////////////
Program Name : CharacterFrequency.java
        input: snehal shitkal
        output: s: 2
                n: 1
                e: 1
                h: 2
                a: 2
                i: 1
                t: 1
                l: 1
*/

import java.util.*;
class CharFrequency
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
            System.out.println("Frequency of  character are:");
            System.out.println(hobj);
    }
}