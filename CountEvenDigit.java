import java.util.*;

class Number
{
    int CountEvenDigit (int iNo)
    {
       int  iDigit = 0,iCnt = 0;
        if(iNo<0)
        {
            iNo = -iNo;
        }
        
        while(iNo!=0)
        {
            iDigit = iNo%10;
            if((iDigit%2)==0)
            {
                iCnt++;
            }
            iNo = iNo/10;
            
        }
        return iCnt;
    }
}
class CountEvenDigit
{
    public static void main(String A[])
    {
        int iValue = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue = sobj.nextInt();
        Number nobj = new Number();
        iRet=nobj.CountEvenDigit(iValue);
        System.out.println("Number Even Digit:"+iRet);
    }
}