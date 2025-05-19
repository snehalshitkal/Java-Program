/*
    Display Pattern
    Input:  5
    Output: -5   -4   -3   -2   -1  0   1   2   3   4   5  
*/
import java.util.*;

class Paterndisplay
{
   
    public void Display(int iNo)
    {
        int icnt;
        if(iNo<0)
        {
            iNo = - iNo;
        }
        for (icnt = -iNo; icnt<=iNo ; icnt++)
        {
            System.out.print(" "+icnt);
        }
    }
}
class Pattern4
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Frequency:");
        iValue =sobj.nextInt();

        Paterndisplay pobj = new Paterndisplay();

        pobj.Display(iValue);

    }
}