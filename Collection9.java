//  Vector
import java.util.*;
class Collection9
{
    public static void main(String A[])
    {
        Vector <Double> vobj =new Vector<Double>();
        vobj.add(11.32);
        vobj.add(21.11);
        vobj.add(51.54);
        vobj.add(101.11);

        System.out.println(vobj);
        vobj.remove(2);
        System.out.println(vobj);

        Iterator oobj = vobj.iterator();

        while(iboj.hasNext())
        {
            System.out.println(iboj.next());
        }
    }
}