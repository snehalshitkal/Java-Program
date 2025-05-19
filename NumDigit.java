import java.util.*;

class Number
{
   
    void DisplayDigit (int iNo)
    {
       int  iDigit = 0;
        if(iNo<0)
        {
            iNo = -iNo;
        }
        System.out.println("Number of Digit:");
        while(iNo!=0)
        {
            iDigit =iNo%10;
            System.out.print(" "+iDigit);
            iNo = iNo/10;
        }
    }
}
class NumDigit
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue = sobj.nextInt();
        Number nobj = new Number();
        nobj.DisplayDigit(iValue);
    }
}