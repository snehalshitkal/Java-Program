/*
    Display Pattern
    Input:  5
    Output: 5   4   3   2   1   
*/
import java.util.*;

class Paterndisplay
{
   int icnt;
    public void Display(int iNo)
    {
        for (icnt = iNo; icnt>=1 ; icnt--)
        {
            System.out.print(" "+icnt);
        }
    }
}
class Pattern3
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