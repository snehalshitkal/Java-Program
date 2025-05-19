import java.util.*;
class Number
{
    public void DisplayFactorial(int iNo)
    {
        int iCnt = 0,iFact = 1;
        for(iCnt = 1;iCnt<=iNo;iCnt++)
        {
            iFact = iFact * iCnt;
        }
        System.out.println("Factorial Number :"+iFact);
    }

}
class Factorial
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        nobj.DisplayFactorial(iValue);
    }
}