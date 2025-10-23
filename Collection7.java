/*
    stack
*/

import java.util.*;
class Collection7
{
    public static void main(String A[])
    {
       Stack<String> sobj = new Stack<String>();
       
        sobj.push("Hello");
        sobj.push("Demo");
        sobj.push("PPA");
        sobj.push("LB");
        sobj.push("Python");

        System.out.println(sobj);
        System.out.println(sobj.size());
        System.out.println(sobj.pop());

        System.out.println(sobj);
        System.out.println(sobj.size());

        System.out.println(sobj.peek());
        System.out.println(sobj);
        System.out.println(sobj.size());

        Iterator iobj = sobj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        sobj.clear();
    }
}