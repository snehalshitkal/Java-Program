/** key --  value
 * for searching unique key --- duplicate value
 * fast bcz hash function
 * 
*/
import java.util.*;
class Collection8
{
    public static void main(String A[])
    {
        Hashtable <String,Integer> hobj = new Hashtable<String,Integer>();
        hobj.put("PPA",25000);
        hobj.put("LB",22000);
        hobj.put("Python",21000);
        hobj.put("Angular",25000);

        System.out.println(hobj);
        System.out.println(hobj.get("LB"));
        System.out.println(hobj.get("Python"));
        System.out.println(hobj.get("Angular"));

        hobj.put("Python",30000);
        System.out.println(hobj.get("Python"));


        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }
    }
}