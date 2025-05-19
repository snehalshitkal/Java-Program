import java.util.*;
class Number
{
    public void Factor(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt<=(iNo/2);iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                System.out.println(" "+iCnt);
            }
            
        }
    }
}
class Factor1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue=sobj.nextInt();
        Number nobj = new Number();
        nobj.Factor(iValue);
        

    }
}