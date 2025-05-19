import java.util.*;

class Number
{
  
    public boolean DisplayPrime(int iNo)
    {
        int iCnt = 0;
        if(iNo<0)
        {
            iNo = -iNo;
        }
        for(iCnt = 2;iCnt<=(iNo/2);iCnt++)
        {
            if ((iNo%iCnt)==0)
            {
                return false;
            }
        }
        if(iCnt>=(iNo/2))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
class PrimeNumber2
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean iRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue=sobj.nextInt();

        Number nobj = new Number();
        iRet=nobj.DisplayPrime(iValue);
        if(iRet==true)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }

    }
}