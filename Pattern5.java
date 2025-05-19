/*
    Display Pattern
    Input:  5
    Output: $   $   $   $   #
*/
import java.util.*;

class Paterndisplay
{
   
    public void Display(int iNo,char ch)
    {
        int icnt;
        if(iNo<0)
        {
            iNo = - iNo;
        }
        for (icnt = 1; iNo>=icnt ; icnt++)
        {
            System.out.print(" "+ ch);
        }
    }
}
class Pattern5
{
    public static void main(String A[])
    {
        int iValue = 0;
        char cChar = '\0';
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Frequency:");
        iValue =sobj.nextInt();

        System.out.println("Enter any Character:"+ cChar);
    
        Paterndisplay pobj = new Paterndisplay();

        pobj.Display(iValue,cChar);

    }
}