
/*
    Array not insert delete element.
    Arraylist does insert and delete elements
    
*/ 
import java.util.*;
class Collection5
{
    public static void main(String A[])
    {
        ArrayList<Integer> aobj = new ArrayList<Integer>();
        aobj.add(11); 
        aobj.add(21); 
        aobj.add(51); 
        aobj.add(101);  

        aobj.remove(3);

        Iterator iobj = aobj.iterator();
        System.out.println("Element of the array list are:");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        System.out.println(aobj.size());
    }
}