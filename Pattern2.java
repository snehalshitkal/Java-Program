/*
    Display Pattern
    Input:  5
    Output: 1   2   3   4   5   
*/
import java.util.*;

class Paterndisplay
{
    int icnt = 0;
    public void Display(int iNo)
    {
        for (icnt = 1; icnt<=iNo ; icnt++)
        {
            System.out.print(" "+icnt);
        }
    }
}
class Pattern2
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