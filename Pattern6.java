/*
    Display Non Linear Pattern
    Input:  row: 5      col:5
    Output: 1   1   1   1   1
            2   2   2   2   2
            3   3   3   3   3
            4   4   4   4   4
            5   5   5   5   5
*/
import java.util.*;

class Paterndisplay
{
   
    public void Display(int iRow,int iCol)
    {
        int i=0,j=0;
        
        for (i = 1; iRow>=i ; i++)
        {
            for (j = 1; iCol>=j ; j++)
            {
                System.out.print(" "+i);
            }
            System.out.println("");
            
        }
    }
}
class Pattern6
{
    public static void main(String A[])
    {
        int iValue1 = 0,iValue2 = 0;
      
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter row:");
        iValue1 =sobj.nextInt();

        System.out.println("Enter coloum:");
        iValue2 =sobj.nextInt();

        Paterndisplay pobj = new Paterndisplay();

        pobj.Display(iValue1,iValue2);

    }
}