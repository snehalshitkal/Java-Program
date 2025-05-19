import java.util.*;
class Number
{
    public void SumEvenFactor(int iNo)
    {
        int iCnt = 0,sum = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        { 
            if((iNo % iCnt) == 0 ) 
            {
                sum = sum + iCnt;  
            } 
        } 
        System.out.println("sum of even factor:"+iCnt);
    }
}
class Factor5
{
    public static void main(String A[])
    {
        int iValue = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue=sobj.nextInt();
        Number nobj = new Number();
        nobj.SumEvenFactor(iValue);
    
    }
}