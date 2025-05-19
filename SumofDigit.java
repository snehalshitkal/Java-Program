import java.util.*;

class Number
{
    int CountNoDigit (int iNo)
    {
       int  iDigit = 0,iSum = 0;
        if(iNo<0)
        {
            iNo = -iNo;
        }
        
        while(iNo!=0)
        {
            iDigit = iNo%10;
            iSum = iSum +iDigit;
            iNo = iNo/10;
         
        }
        return iSum;
    }
}
class SumofDigit
{
    public static void main(String A[])
    {
        int iValue = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue = sobj.nextInt();
        Number nobj = new Number();
        iRet=nobj.CountNoDigit(iValue);
        System.out.println("Sum of Digit:"+iRet);
    }
}