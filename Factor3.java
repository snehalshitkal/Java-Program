import java.util.*;
class Number
{
    public void FactorNonFactor(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        { 
            if((iNo%iCnt) == 0)
            {
                System.out.println("Factors: "+iCnt);
            }
            
            else
            {
                 System.out.println("Non Factor:"+iCnt);
            }
        }
        
    }
}
class Factor3
{
    public static void main(String A[])
    {
        int iValue = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue=sobj.nextInt();
        Number nobj = new Number();
        nobj.FactorNonFactor(iValue);
    
    }
}