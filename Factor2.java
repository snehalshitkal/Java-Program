import java.util.*;
class Number
{
    public int SumFactor(int iNo)
    {
        int iCnt = 0,sum= 0;
        for(iCnt = 1;iCnt<=iNo;iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                sum= sum+iCnt;
            }
        }
        return sum;
    }
}
class Factor2
{
    public static void main(String A[])
    {
        int iValue = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue=sobj.nextInt();
        Number nobj = new Number();
        iRet= nobj.SumFactor(iValue);
        System.out.println("Sum of Factor:"+iRet);
        

    }
}