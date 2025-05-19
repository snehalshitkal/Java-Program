import java.util.*;
class Number
{
    void DisplayPerfect(int iNo)
    {
        int iCnt = 0, isum = 0;
        for(iCnt = 1;iCnt < iNo/2; iCnt++)
        {
            isum = isum + iCnt;
        }
        if (isum == iNo)
        {
            System.out.println("Perfect Number:"+iNo);
        }
        else
        {
            System.out.println("Not Perfect Number:"+iNo);
        }
    }

}
class PerfectNumber
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue = sobj.nextInt();
        Number nobj = new Number();
        nobj.DisplayPerfect(iValue);

    }
}